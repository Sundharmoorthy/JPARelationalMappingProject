package com.Project.SpringJpaMappingApplication.Service;


import com.Project.SpringJpaMappingApplication.DTO.ProfileDTO;
import com.Project.SpringJpaMappingApplication.Mapper.ProfileMapper;
import com.Project.SpringJpaMappingApplication.Model.Profile;
import com.Project.SpringJpaMappingApplication.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public List<ProfileDTO> getAllProfiles() {
        return profileRepository.findAll().stream()
                .map(ProfileMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProfileDTO getProfileById(Long id) {
        Profile profile = profileRepository.findById(id).orElseThrow(new Supplier<RuntimeException>() {
            @Override
            public RuntimeException get() {
                return new RuntimeException("Profile not found");
            }
        });
        return ProfileMapper.toDTO(profile);
    }

    public ProfileDTO createProfile(ProfileDTO profileDTO) {
        Profile profile = ProfileMapper.toEntity(profileDTO);
        Profile savedProfile = profileRepository.save(profile);
        return ProfileMapper.toDTO(savedProfile);
    }

    public ProfileDTO updateProfile(Long id, ProfileDTO profileDTO) {
        Profile profile = profileRepository.findById(id).orElseThrow(() -> new RuntimeException("Profile not found"));
        profile.setBio(profileDTO.getBio());
        // Update other fields as needed
        Profile updatedProfile = profileRepository.save(profile);
        return ProfileMapper.toDTO(updatedProfile);
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}
