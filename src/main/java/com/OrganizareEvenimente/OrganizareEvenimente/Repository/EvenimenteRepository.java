package com.OrganizareEvenimente.OrganizareEvenimente.Repository;

import com.OrganizareEvenimente.OrganizareEvenimente.General.Eveniment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenimenteRepository extends JpaRepository<Eveniment, Integer> {
}
