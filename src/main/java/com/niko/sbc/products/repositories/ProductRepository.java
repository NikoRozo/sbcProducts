package com.niko.sbc.products.repositories;

import com.niko.sbc.products.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
