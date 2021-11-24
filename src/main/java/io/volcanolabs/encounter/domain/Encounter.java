package io.volcanolabs.encounter.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Encounter {

	@Id
	@GeneratedValue
	UUID id;
}
