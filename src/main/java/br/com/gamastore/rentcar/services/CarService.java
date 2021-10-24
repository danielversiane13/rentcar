package br.com.gamastore.rentcar.services;

import java.util.ArrayList;
import java.util.List;

import br.com.gamastore.rentcar.entities.Car;

public class CarService {

	private static List<Car> cars = new ArrayList<Car>(
			List.of(new Car("black", "AA", 2013, 2014, "AAA0000", 100), new Car("blue", "BB", 2012, 2013, "BBB0000", 85)));

}
