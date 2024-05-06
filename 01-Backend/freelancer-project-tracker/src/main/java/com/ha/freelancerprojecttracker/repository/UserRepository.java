package com.ha.freelancerprojecttracker.repository;

import com.ha.freelancerprojecttracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
