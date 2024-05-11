package com.nghiangong.identityservice.mapper;

import com.nghiangong.identityservice.dto.request.PermissionRequest;
import com.nghiangong.identityservice.dto.response.PermissionResponse;
import com.nghiangong.identityservice.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
