package com.example.jpa.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Item")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;
}
