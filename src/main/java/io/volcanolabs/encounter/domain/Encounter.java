package io.volcanolabs.encounter.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Encounter {

	@Id
	@GeneratedValue
	UUID id;

	UUID patientId;

	@OrderColumn
	@ElementCollection
	List<UUID> notes;
}
