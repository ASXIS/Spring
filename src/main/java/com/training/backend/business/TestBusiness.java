package com.training.backend.business;

import com.training.backend.exception.BaseException;
import com.training.backend.exception.FileException;
import com.training.backend.exception.UserException;
import com.training.backend.model.MRegisterRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class TestBusiness {
    public String register(MRegisterRequest request) throws BaseException {
        if (request == null) {
            throw UserException.requestNull();
        }

        if (Objects.isNull(request.getEmail())) {
            throw UserException.emailNull();
        }

        return "";
    }

    public String uploadProfilePicture(MultipartFile file) throws UserException {
        if (file == null) {
            //throw error
            throw FileException.fileNull();

        }
        if (file.getSize() > 1048576 * 2) {
            //throw error
            throw FileException.fileMaxSize();
        }

        String contentType = file.getContentType();
        if (contentType == null) {
            //throw error
            throw FileException.unsupported();
        }

        List<String> supportedTypes = Arrays.asList("image/jpeg", "image/png");
        if (supportedTypes.contains(contentType)) {
            //throw error
            throw FileException.unsupported();
        }
        // TODO: upload file File Storage (AWS, etc.)
        try {
            byte[] bytes = file.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
