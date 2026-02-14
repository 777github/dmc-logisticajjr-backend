package com.logisticajjr.bodega.service;

import com.logisticajjr.bodega.model.Order;
import com.logisticajjr.bodega.repo.IOrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements IOrderService{

    private final IOrderRepo repo;

    @Override
    public Order save(Order order) throws Exception {
        return repo.save(order);
    }

    @Override
    public Order update(Order order, Integer id) throws Exception {
        return repo.save(order);
    }

    @Override
    public List<Order> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Order findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Order());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
