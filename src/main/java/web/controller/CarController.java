package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCarList(
            @RequestParam(defaultValue = "5") Integer count,
            ModelMap model) {
        if(count != null) {
            model.addAttribute("carList"
                    , carService.getCars(count));
        } else {
            model.addAttribute("carList", carService.getCars(carService.getCarListSize()));
        }
        return "cars";
    }
}