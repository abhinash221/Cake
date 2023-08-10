package com.example.cake_ordering_system.repository;


import com.example.cake_ordering_system.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
