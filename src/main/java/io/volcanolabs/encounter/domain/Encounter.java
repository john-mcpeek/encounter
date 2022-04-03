package io.volcanolabs.encounter.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Builder
@Jacksonized
@NoArgsConstructor
@AllArgsConstructor
public class Encounter {

	@Id
	@GeneratedValue
	UUID id;

	LocalDateTime dateTime;

	UUID locationId;

	UUID originatorId;

	UUID patientId;
}
