package com.nghiangong.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nghiangong.identityservice.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}
