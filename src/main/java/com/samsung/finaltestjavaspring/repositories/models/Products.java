package com.samsung.finaltestjavaspring.repositories.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=150,nullable = false)
    private String name;

    @Column(length=200)
    private String picture;

    private Long price;

    @OneToOne
    @JoinColumn(name = "catalog_id", referencedColumnName = "id")
    private Catalog catalog;



    @ManyToMany(mappedBy = "products_id")
    private Set<OrderDetail> orderDetails;
}
