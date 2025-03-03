package com.julianomarthins.entidadesParaUm.dto;

import com.julianomarthins.entidadesParaUm.entities.Department;

public class DepartmentDTO {

    private Long id;
    private String name;

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department entity){
        id = entity.getId();
        name = entity.getName();
    }

    public DepartmentDTO() {

    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
