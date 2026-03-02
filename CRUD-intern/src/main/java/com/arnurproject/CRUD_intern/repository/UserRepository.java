package com.arnurproject.CRUD_intern.repository;

import com.arnurproject.CRUD_intern.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
