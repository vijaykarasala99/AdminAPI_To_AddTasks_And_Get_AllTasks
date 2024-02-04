package com.vijayit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijayit.entity.AdminEntity;

public interface AdminRepo extends JpaRepository<AdminEntity, Integer> {

}
