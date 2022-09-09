package com.rakesh.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakesh.entity.ImageData;

public interface StorageRepo extends JpaRepository<ImageData, Integer> {

	
	Optional<ImageData> findByName(String name);
}
