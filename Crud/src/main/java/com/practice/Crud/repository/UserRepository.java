package com.practice.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.Crud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
