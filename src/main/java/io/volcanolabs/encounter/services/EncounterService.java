package io.volcanolabs.encounter.services;

import io.volcanolabs.encounter.domain.Encounter;
import io.volcanolabs.encounter.repositories.EncounterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EncounterService {

	private final EncounterRepository encounterRepo;

	public EncounterService(EncounterRepository encounterRepo) {
		this.encounterRepo = encounterRepo;
	}

	public Encounter getEncounter(UUID encounterId) {
		return null;
	}

	public List<Encounter> getEncounterPage(UUID patientId, int page, int pageSize) {
		return null;
	}
}
