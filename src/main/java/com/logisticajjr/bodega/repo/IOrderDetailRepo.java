package com.logisticajjr.bodega.repo;

import com.logisticajjr.bodega.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderDetailRepo extends JpaRepository<OrderDetail, Integer> {
}
