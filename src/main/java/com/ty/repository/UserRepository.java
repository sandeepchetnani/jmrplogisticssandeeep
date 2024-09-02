package com.ty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
