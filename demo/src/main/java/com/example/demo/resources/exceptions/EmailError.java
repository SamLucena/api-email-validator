package com.example.demo.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class EmailError implements Serializable {

    private String message;
    private boolean isValid;
    private String path;
    private Instant timestamp;

    public EmailError(){}

    public EmailError(String message, boolean isValid, String path, Instant timestamp) {
        this.message = message;
        this.isValid = isValid;
        this.path = path;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
