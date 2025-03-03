package com.julianomarthins.entidadesParaUm.repositories;

import com.julianomarthins.entidadesParaUm.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
