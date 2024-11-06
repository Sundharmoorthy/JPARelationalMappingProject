package com.Project.SpringJpaMappingApplication.Mapper;


import com.Project.SpringJpaMappingApplication.DTO.ProfileDTO;
import com.Project.SpringJpaMappingApplication.Model.Profile;

public class ProfileMapper {

    public static ProfileDTO toDTO(Profile profile) {
        return new ProfileDTO(profile.getId(), profile.getBio(), profile.getAddress(), profile.getPhoneNumber());
    }

    public static Profile toEntity(ProfileDTO profileDTO) {
        Profile profile = new Profile();
        profile.setId(profile.getId());
        profile.setBio(profileDTO.getBio());
        profile.setAddress(profileDTO.getAddress());
        profile.setPhoneNumber(profileDTO.getPhoneNumber());
        return profile;
    }
}
