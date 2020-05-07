package com.uhasselt.VrijwilligerApp.repository;

import com.uhasselt.VrijwilligerApp.models.Inschrijving;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IInschrijvingRepository extends JpaRepository<Inschrijving, Long> {
    List<Inschrijving> getAllInschrijvingen(int accountId);
}