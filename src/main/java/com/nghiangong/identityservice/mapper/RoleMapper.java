package com.nghiangong.identityservice.mapper;

import com.nghiangong.identityservice.dto.request.RoleRequest;
import com.nghiangong.identityservice.dto.response.RoleResponse;
import com.nghiangong.identityservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
