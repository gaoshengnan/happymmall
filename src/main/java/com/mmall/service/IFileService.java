package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Seina on 2018/4/24.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
