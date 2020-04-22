package com.xxr.springboot.file.inteface;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
    String storeFile(MultipartFile file);

    Resource loadFileAsResource(String fileName);
}
