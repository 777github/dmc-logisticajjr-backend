package com.logisticajjr.bodega.repo;

import com.logisticajjr.bodega.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product, Integer> {
}
