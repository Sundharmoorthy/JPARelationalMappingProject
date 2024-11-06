package com.Project.SpringJpaMappingApplication.DTO;

import com.Project.SpringJpaMappingApplication.Model.Profile;

import java.time.LocalDateTime;

public class UserDTO {
    private Long id;
    private String username;
    private Profile profile; // Nested DTO for Profile

    private String socialSecurityNumber; // Sensitive field
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Excluding socialSecurityNumber, createdAt, and updatedAt


    public UserDTO() {
    }

    public UserDTO(Long id, String username, Profile profile, String socialSecurityNumber, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.username = username;
        this.profile = profile;
        this.socialSecurityNumber = socialSecurityNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }



    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}

