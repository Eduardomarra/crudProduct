package com.emarra.crudProduct.services;

import com.emarra.crudProduct.dtos.ProductDTO;
import com.emarra.crudProduct.entities.Product;
import com.emarra.crudProduct.repositories.ProductRepository;
import com.emarra.crudProduct.services.exceptions.ResourceNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> product = repository.findAll(pageable);
        return product.map(p -> new ProductDTO(p));
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new ProductDTO(product);
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product product = new Product();
        copyToEntity(product, dto);
        product = repository.save(product);
        return new ProductDTO(product);
    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO dto) {
        Product product = repository.getReferenceById(id);
        copyToEntity(product, dto);
        product = repository.save(product);
        return new ProductDTO(product);
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private void copyToEntity(Product product, ProductDTO dto){
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice_in_cents(dto.getPrice_in_cents());
        product.setImgUrl(dto.getImgUrl());
    }
}
