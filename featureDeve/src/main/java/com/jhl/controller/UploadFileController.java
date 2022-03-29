package com.jhl.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @Description
 * @Author jhl
 * @Date 2022/3/15 20:55
 * @Version 1.0
 */
@Component
@RestController
@RequestMapping(value = "/upload")
public class UploadFileController {

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public void uploadFile(@RequestParam("file") MultipartFile[] files) {

        String fileFoler = "/F/zdevOut/";
        for (MultipartFile multipartFile : files) {
            String originalFilename = multipartFile.getOriginalFilename();
            File file=new File(fileFoler+File.separator+originalFilename);
            try {
                Path path = file.toPath();
                multipartFile.transferTo(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
