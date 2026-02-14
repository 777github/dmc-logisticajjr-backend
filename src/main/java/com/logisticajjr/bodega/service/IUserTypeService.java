package com.logisticajjr.bodega.service;

import com.logisticajjr.bodega.model.UserType;

import java.util.List;

public interface IUserTypeService {

    UserType save(UserType userType) throws Exception;
    UserType update(UserType userType, Integer id) throws Exception;
    List<UserType> findAll() throws Exception;
    UserType findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;

}
