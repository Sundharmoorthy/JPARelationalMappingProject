package com.Project.SpringJpaMappingApplication.Mapper;


import com.Project.SpringJpaMappingApplication.DTO.ProfileDTO;
import com.Project.SpringJpaMappingApplication.Model.Profile;

public class ProfileMapper {

    public static ProfileDTO toDTO(Profile profile) {
        return new ProfileDTO(profile.getId(), profile.getBio(), profile.getAddress(), profile.getPhoneNumber());
    }

    public static Profile toEntity(ProfileDTO profileDTO) {
        Profile profile = new Profile();
        profile.setBio(profileDTO.getBio());
        return profile;
    }
}
