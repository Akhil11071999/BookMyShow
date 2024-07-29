package com.application.backendproject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;


@Data
@Entity
public class Movie {
    @Id
    private int id;
    private String title;
}
