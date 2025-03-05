package com.julianomarthins.entidadesParaUm.dto;

import com.julianomarthins.entidadesParaUm.entities.Category;

public class CategoryDTO {

    // Atributos de Classe
    private Long id;
    private String name;

    // Relacionamentos



    // Construtores
    public CategoryDTO(){

    }

    public CategoryDTO(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity){
        id = entity.getId();
        name = entity.getName();

    }


    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
