package com.logisticajjr.bodega.service;

import com.logisticajjr.bodega.model.User;
import com.logisticajjr.bodega.repo.IUserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService{

    private final IUserRepo repo;

    @Override
    public User save(User user) throws Exception {
        return repo.save(user);
    }

    @Override
    public User update(User user, Integer id) throws Exception {
        return repo.save(user);
    }

    @Override
    public List<User> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public User findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new User());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }

    @Override
    public User login(String username, String password) throws Exception{
        return new User();
    }
}
