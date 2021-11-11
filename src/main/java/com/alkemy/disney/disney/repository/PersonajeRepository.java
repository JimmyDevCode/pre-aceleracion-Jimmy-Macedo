package com.alkemy.disney.disney.repository;

import com.alkemy.disney.disney.entity.PersonajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;
@Repository
public interface PersonajeRepository extends JpaRepository<PersonajeEntity, Long> {

    List<PersonajeEntity> findAll(Specification<PersonajeEntity> spec);
}
