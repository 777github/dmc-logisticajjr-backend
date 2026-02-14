package com.logisticajjr.bodega.service;

import com.logisticajjr.bodega.model.UserType;
import com.logisticajjr.bodega.repo.IUserTypeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserTypeServiceImpl implements IUserTypeService{

    private final IUserTypeRepo repo;

    @Override
    public UserType save(UserType userType) throws Exception {
        return repo.save(userType);
    }

    @Override
    public UserType update(UserType userType, Integer id) throws Exception {
        return repo.save(userType);
    }

    @Override
    public List<UserType> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public UserType findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new UserType());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
