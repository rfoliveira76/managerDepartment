package com.br.department.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.br.department.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}