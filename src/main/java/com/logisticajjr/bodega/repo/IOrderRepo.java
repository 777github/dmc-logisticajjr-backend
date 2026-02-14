package com.logisticajjr.bodega.repo;

import com.logisticajjr.bodega.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order, Integer> {
}
