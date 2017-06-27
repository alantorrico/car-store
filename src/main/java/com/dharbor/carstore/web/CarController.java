package com.dharbor.carstore.web;

import com.dharbor.carstore.domain.Car;
import com.dharbor.carstore.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Martin on 27/6/17.
 */

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.POST)
    public void addCar(@RequestBody CarRequestDTO car){
        carService.addCar(car);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getAll(){
        return carService.getAll();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Car deleteCar(@PathVariable String id){
        return carService.deleteCar(id);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Car updateCar(@PathVariable String id, @RequestBody CarRequestDTO car){
        return carService.updateCar(id, car);
    }

    public static class CarRequestDTO{
        private String brand;
        private int year;
        private String model;
        private String color;
        private String image;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
