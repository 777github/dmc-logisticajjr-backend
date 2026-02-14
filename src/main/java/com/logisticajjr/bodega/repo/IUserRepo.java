package com.logisticajjr.bodega.repo;

import com.logisticajjr.bodega.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
