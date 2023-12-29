package com.ThiagoSantos.PDV.core.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sale_item")
public class SaleItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer salesQuantity;
    private Double unitPrice;
    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public SaleItem(){}

    public SaleItem(Long id, Integer salesQuantity, Double unitPrice, Sale sale, Product product) {
        this.id = id;
        this.salesQuantity = salesQuantity;
        this.unitPrice = unitPrice;
        this.sale = sale;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(Integer salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "SaleItem{" +
                "id=" + id +
                ", salesQuantity=" + salesQuantity +
                ", unitPrice=" + unitPrice +
                ", sale=" + sale +
                ", product=" + product +
                '}';
    }
}
