package org.camiloleal.infraestructura.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoPersona extends JpaRepository<EntidadPersona, Integer> {
}
