package com.Project.SpringJpaMappingApplication.DTO;

public class ProfileDTO {
    private Long id;
    private String bio;
    private String address;
    private String phoneNumber;

    // Excluding address and phoneNumber


    public ProfileDTO(Long id, String bio, String address, String phoneNumber) {
        this.id = id;
        this.bio = bio;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public ProfileDTO() {
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
