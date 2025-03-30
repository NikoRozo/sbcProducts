package com.niko.sbc.products.services;

import com.niko.sbc.products.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);
}
