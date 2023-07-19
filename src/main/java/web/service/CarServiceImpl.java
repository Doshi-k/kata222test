package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("red","Norm-car",11));
        cars.add(new Car("black","Super-car",5));
        cars.add(new Car("green","Meh-car",2));
        cars.add(new Car("orange","Haha-car",7));
        cars.add(new Car("blue","Wow-car",13));
    }

    @Override
    public List<Car> getCars (){
        return cars;
    }

}
