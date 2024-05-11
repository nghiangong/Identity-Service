package com.nghiangong.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nghiangong.identityservice.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
