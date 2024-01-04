package com.ThiagoSantos.PDV.domain.services;

import com.ThiagoSantos.PDV.core.entities.Product;
import com.ThiagoSantos.PDV.domain.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
       return productRepository.findAll();
    }

    public Product findById(Long id){
        return productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found with id: " + id));
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product update(Long id, Product productUpdate){
        Product existingProduct = findById(id);
        existingProduct.updateFields(productUpdate);
        return productRepository.save(productUpdate);
    }
    
    public Product delete(Long id){
        Product productToDeleted = findById(id);
        productRepository.deleteById(id);
        return productToDeleted;
    }

}
