package com.rakesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.rakesh.entity.ImageData;
import com.rakesh.repo.StorageRepo;

@Service
public class StorageService {
	
    @Autowired
	private StorageRepo storageRepo;
    
    public String uploadImage(MultipartFile file) {
		return null;
    	//storageRepo.save(ImageData.setType(file.getContentType()).setImageDate(file.getBytes())));
    }
}
