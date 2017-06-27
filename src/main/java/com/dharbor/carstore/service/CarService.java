package com.dharbor.carstore.service;

import com.dharbor.carstore.domain.Car;
import com.dharbor.carstore.repository.CarRepository;
import com.dharbor.carstore.web.CarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Martin on 27/6/17.
 */
@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public void addCar(CarController.CarRequestDTO car){
        Car newCar = new Car();
        newCar.setBrand(car.getBrand());
        newCar.setYear(car.getYear());
        newCar.setModel(car.getModel());
        newCar.setColor(car.getColor());
        newCar.setImage(car.getImage());

        carRepository.save(newCar);
    }

    public List<Car> getAll(){
        return carRepository.findAll();
    }

    public Car deleteCar(String id){
        Car car = carRepository.findOne(id);
        carRepository.delete(car);
        return car;
    }

    public Car updateCar(String id, CarController.CarRequestDTO oldCar){
        Car car = carRepository.findOne(id);
        car.setBrand(oldCar.getBrand());
        car.setYear(oldCar.getYear());
        car.setModel(oldCar.getModel());
        car.setColor(oldCar.getColor());
        car.setImage(oldCar.getImage());

        return carRepository.save(car);
    }
}
