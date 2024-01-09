package com.ThiagoSantos.PDV.core.entities.dto;

import com.ThiagoSantos.PDV.core.entities.SaleItem;
import com.ThiagoSantos.PDV.core.entities.User;

import java.time.Instant;
import java.util.List;

public record SaleDto(Instant date, User seller, Double totalSale, List<SaleItem> items) {
}
