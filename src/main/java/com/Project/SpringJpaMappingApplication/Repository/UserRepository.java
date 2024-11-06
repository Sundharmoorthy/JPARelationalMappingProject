package com.Project.SpringJpaMappingApplication.Repository;

import com.Project.SpringJpaMappingApplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
