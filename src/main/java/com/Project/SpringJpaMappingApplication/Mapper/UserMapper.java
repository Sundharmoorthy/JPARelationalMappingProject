package com.Project.SpringJpaMappingApplication.Mapper;


import com.Project.SpringJpaMappingApplication.DTO.UserDTO;
import com.Project.SpringJpaMappingApplication.Model.User;

public class UserMapper {

    public static UserDTO toDTO(User user) {

        return new UserDTO(user.getId(), user.getUsername(), user.getProfile(),user.getSocialSecurityNumber(),user.getCreatedAt(),user.getUpdatedAt());
    }

    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setCreatedAt(userDTO.getCreatedAt());
        user.setProfile(userDTO.getProfile());
        user.setSocialSecurityNumber(userDTO.getSocialSecurityNumber());
        user.setUpdatedAt(userDTO.getUpdatedAt());
        return user;
    }
}
