package io.volcanolabs.encounter.controllers;

import io.volcanolabs.encounter.domain.Encounter;
import io.volcanolabs.encounter.services.EncounterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping( "/api/v1/encounters" )
public class EncounterController {
	private final EncounterService encounterSvc;

	public EncounterController(EncounterService encounterSvc) {
		this.encounterSvc = encounterSvc;
	}

	@GetMapping( "{encounterId}" )
	public Encounter getEncounter(@PathVariable UUID encounterId) {
		var encounter = encounterSvc.getEncounter( encounterId );

		return encounter;
	}
}
