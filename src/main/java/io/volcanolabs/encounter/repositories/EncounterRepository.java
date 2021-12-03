package io.volcanolabs.encounter.repositories;

import io.volcanolabs.encounter.domain.Encounter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EncounterRepository extends JpaRepository<Encounter, UUID> {
}