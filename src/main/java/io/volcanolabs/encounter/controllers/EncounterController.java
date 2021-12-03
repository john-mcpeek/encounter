package io.volcanolabs.encounter.controllers;

import io.volcanolabs.encounter.services.EncounterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EncounterController {
	private final EncounterService encounterSvc;

	public EncounterController(EncounterService encounterSvc) {
		this.encounterSvc = encounterSvc;
	}

}
