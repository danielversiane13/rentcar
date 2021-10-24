package br.com.gamastore.rentcar.entities;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Rent {

	private Car car;
	private Customer customer;
	private LocalDateTime startDate;
	private LocalDateTime endDate;

}
