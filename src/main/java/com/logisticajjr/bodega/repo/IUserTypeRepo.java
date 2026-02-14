package com.logisticajjr.bodega.repo;

import com.logisticajjr.bodega.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserTypeRepo extends JpaRepository<UserType, Integer> {
}
