package br.com.gamastore.rentcar.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gamastore.rentcar.entities.Car;

public interface CarRepository extends JpaRepository<Car, UUID> {

	List<Car> findAllByBrand(String brand);
	
}
