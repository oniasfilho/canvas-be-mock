package com.example.canvasmock.dto;

import lombok.Data;

@Data
public class GenericDTO {
    Integer id;
    String text;

    public GenericDTO(Integer id, String text) {
        this.id = id;
        this.text = text;
    }
}
