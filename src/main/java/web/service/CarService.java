package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
        private final List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car(111, "Bugatti", "white"));
        carList.add(new Car(222, "Ferrari", "silver"));
        carList.add(new Car(333, "Lamborghini", "red"));
        carList.add(new Car(444, "Rolls-Royce", "black"));
        carList.add(new Car(555, "Bentley", "blue"));
    }
    public List<Car> getCars(int count) {
        if(count >= carList.size()) {
            return carList;
        } else {
        return carList.stream() //преобразую список carList в поток
                .limit(count) //ограничиваю поток количеством элементов, указанных в count
                .toList(); // преобразую элементы потока обратно в список
        }
    }
    public int getCarListSize() {
        return carList.size();
    }
}
