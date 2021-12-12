package io.volcanolabs.encounter.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Encounter {

	@Id
	@GeneratedValue
	UUID id;

	UUID patientId;

	LocalDateTime dateTime;

	@OrderColumn
	@ElementCollection
	List<UUID> notes;
}
