package com.julianomarthins.entidadesParaUm.services;

import com.julianomarthins.entidadesParaUm.dto.CategoryDTO;
import com.julianomarthins.entidadesParaUm.dto.ProductDTO;
import com.julianomarthins.entidadesParaUm.entities.Category;
import com.julianomarthins.entidadesParaUm.entities.Product;
import com.julianomarthins.entidadesParaUm.repositories.CategoryRepository;
import com.julianomarthins.entidadesParaUm.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    public ProductDTO insert(ProductDTO dto) {
        Product entity = new Product();

        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());

        for (CategoryDTO catDto : dto.getCategories()) {

            Category cat = categoryRepository.getReferenceById(catDto.getId());

            entity.getCategories().add(cat);
        }

        entity = productRepository.save(entity);
        return new ProductDTO(entity);


    }
}
