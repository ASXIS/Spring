package com.training.backend.exception;

public class FileException extends BaseException {

    public FileException(String code) {
        super("file." + code);
    }

    public static UserException fileNull() {
        return new UserException("null");
    }

    public static UserException fileMaxSize() {
        return new UserException("max.size");
    }

    public static UserException unsupported() {
        return new UserException("unsupported.file.type");
    }

}
