package com.logisticajjr.bodega.service;

import com.logisticajjr.bodega.model.OrderDetail;
import com.logisticajjr.bodega.repo.IOrderDetailRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailServiceImpl implements IOrderDetailService {

    private final IOrderDetailRepo repo;

    @Override
    public OrderDetail save(OrderDetail orderDetail) throws Exception {
        return repo.save(orderDetail);
    }

    @Override
    public OrderDetail update(OrderDetail orderDetail, Integer id) throws Exception {
        return null;
    }

    @Override
    public List<OrderDetail> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public OrderDetail findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new OrderDetail());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
