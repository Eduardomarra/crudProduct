package com.emarra.crudProduct.dtos;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {

    private List<FieldMessage> fieldMessages = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessage> getFieldMessages() {
        return fieldMessages;
    }

    public void addFields(String fieldName, String message) {
        fieldMessages.add(new FieldMessage(fieldName, message));
    }
}
