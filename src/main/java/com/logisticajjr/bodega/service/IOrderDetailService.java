package com.logisticajjr.bodega.service;

import com.logisticajjr.bodega.model.OrderDetail;

import java.util.List;

public interface IOrderDetailService {

    OrderDetail save(OrderDetail orderDetail) throws Exception;
    OrderDetail update(OrderDetail orderDetail, Integer id) throws Exception;
    List<OrderDetail> findAll() throws Exception;
    OrderDetail findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;

}
