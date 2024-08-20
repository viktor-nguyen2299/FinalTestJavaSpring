package com.samsung.finaltestjavaspring.repositories.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=150,nullable = false)
    private String name;

    private boolean status;

    @OneToOne(mappedBy = "catalog", cascade = CascadeType.ALL)
    private Products product;
}
