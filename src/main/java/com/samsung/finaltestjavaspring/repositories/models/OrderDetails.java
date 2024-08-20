package com.samsung.finaltestjavaspring.repositories.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long Unit_price;
    private Integer quantity;

    @OneToOne // Đánh dấu có mỗi quan hệ 1-1 với Order ở phía dưới
    @JoinColumn(name = "order_id") // Liên kết với nhau qua khóa ngoại order_id
    private Orders order;

    @ManyToMany
    @JoinTable(name = "Product_OrderDetails",
            joinColumns = @JoinColumn(name = "products_id"),
            inverseJoinColumns = @JoinColumn(name = "orderDetails_id"))
    private Set<Products> products_id;

}
