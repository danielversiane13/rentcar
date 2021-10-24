package br.com.gamastore.rentcar.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

@Data
public class Entity {

	private UUID id;
	private boolean active;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public Entity() {
		id = UUID.randomUUID();
		LocalDateTime now = LocalDateTime.now();
		active = true;
		createdAt = now;
		updatedAt = now;
	}

}
