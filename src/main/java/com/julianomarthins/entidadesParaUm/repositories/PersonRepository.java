package com.julianomarthins.entidadesParaUm.repositories;

import com.julianomarthins.entidadesParaUm.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
