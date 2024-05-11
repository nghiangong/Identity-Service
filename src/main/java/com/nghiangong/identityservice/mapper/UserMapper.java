package com.nghiangong.identityservice.mapper;

import com.nghiangong.identityservice.dto.request.UserCreationRequest;
import com.nghiangong.identityservice.dto.request.UserUpdateRequest;
import com.nghiangong.identityservice.dto.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.nghiangong.identityservice.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
