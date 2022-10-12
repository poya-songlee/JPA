package com.example.jpa.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Item {

    Long id;

    String name;
}
