package com.emarra.crudProduct.services;

import com.emarra.crudProduct.dtos.ProductDTO;
import com.emarra.crudProduct.entities.Product;
import com.emarra.crudProduct.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> product = repository.findAll(pageable);
        return product.map(p -> new ProductDTO(p));
    }
}
