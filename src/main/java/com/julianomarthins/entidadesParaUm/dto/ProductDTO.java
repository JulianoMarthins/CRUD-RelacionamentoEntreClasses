package com.julianomarthins.entidadesParaUm.dto;

import com.julianomarthins.entidadesParaUm.entities.Category;
import com.julianomarthins.entidadesParaUm.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

    // Atributos de Classe
    private Long id;
    private String name;
    private Double price;

    // Relacionamentos
    private List<CategoryDTO> categories = new ArrayList<>();


    // Construtores
    public ProductDTO() {

    }

    public ProductDTO(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();

        for (Category category : entity.getCategories()) {
            categories.add(new CategoryDTO(category));
        }
    }


    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }
}
