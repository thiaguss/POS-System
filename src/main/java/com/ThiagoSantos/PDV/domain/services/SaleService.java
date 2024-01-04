package com.ThiagoSantos.PDV.domain.services;

import com.ThiagoSantos.PDV.core.entities.Sale;
import com.ThiagoSantos.PDV.core.entities.SaleItem;
import com.ThiagoSantos.PDV.domain.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findAll(){
        return saleRepository.findAll();
    }

    public Sale findById(Long id){
        return saleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Sale not found with id: " + id));
    }

    public Sale save(Sale sale){
        saleItemsWithSale(sale);
        return saleRepository.save(sale);
    }

    private void saleItemsWithSale(Sale sale){
        sale.getItems().forEach(saleItem -> saleItem.setSale(sale));
    }

    public Sale delete(Long id){
        Sale saleToDeleted = findById(id);
        saleRepository.deleteById(id);
        return saleToDeleted;
    }
}
