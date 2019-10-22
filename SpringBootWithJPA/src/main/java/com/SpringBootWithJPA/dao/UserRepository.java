package com.SpringBootWithJPA.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootWithJPA.model.User;
@Repository

public interface UserRepository extends CrudRepository<User, Integer> {

}
