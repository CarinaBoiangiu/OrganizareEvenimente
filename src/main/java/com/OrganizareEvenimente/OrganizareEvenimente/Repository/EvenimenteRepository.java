package com.OrganizareEvenimente.OrganizareEvenimente.Repository;

import com.OrganizareEvenimente.OrganizareEvenimente.General.Eveniment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EvenimenteRepository extends JpaRepository<Eveniment, Long> {
    List<Eveniment> findByLocatie(String locatie);

    List<Eveniment> findByData(LocalDate data);
}
