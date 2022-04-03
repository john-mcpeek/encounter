package io.volcanolabs.encounter.services;

import io.volcanolabs.encounter.config.KafkaConfig;
import io.volcanolabs.encounter.domain.Encounter;
import io.volcanolabs.encounter.repositories.EncounterRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class EncounterService {

	private final EncounterRepository encounterRepo;

	private final KafkaTemplate<UUID, Encounter> kafkaTemplate;

	public EncounterService(EncounterRepository encounterRepo, KafkaTemplate<UUID, Encounter> kafkaTemplate) {
		this.encounterRepo = encounterRepo;
		this.kafkaTemplate = kafkaTemplate;
	}

	public Encounter createEncounter(UUID originatorId, UUID locationId, UUID patientId) {
		var encounter = Encounter.builder()
				.id( UUID.randomUUID() )
				.dateTime( LocalDateTime.now() )
				.locationId( locationId )
				.originatorId( originatorId )
				.patientId( patientId )
				.build();

		kafkaTemplate.send( KafkaConfig.ENCOUNTER_CREATED_0, encounter.getId(), encounter );

		return encounter;
	}

	public Encounter getEncounter(UUID encounterId) {
		return encounterRepo.getById( encounterId );
	}

	public List<Encounter> getEncounterPage(UUID patientId, int page, int pageSize) {
		return null;
	}
}
