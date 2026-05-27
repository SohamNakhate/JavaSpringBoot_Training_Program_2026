package com.eduLive.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Batch {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long batchId;

    private String batchName;

    @ManyToMany
    private List<User> educators;

    @ManyToMany
    private List<User> students;

}