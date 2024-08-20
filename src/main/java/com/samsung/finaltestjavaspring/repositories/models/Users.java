package com.samsung.finaltestjavaspring.repositories.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=150,unique = true)
    private String username;

    @Column(length=50)
    private String password;

    @Column(length = 150)
    private String email;

    @Column(length = 150)
    private String Fullname;

    private boolean status;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Orders> orders;
}
