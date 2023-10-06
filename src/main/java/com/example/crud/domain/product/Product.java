package com.example.crud.domain.product;

import jakarta.persistence.*;

import lombok.*;

@Table(name ="product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private  String name;
    private  Integer price_in_cents;

    public Product(RequestProductDTO requestProductDTO){
        this.name = requestProductDTO.name();
        this.price_in_cents= requestProductDTO.price_in_cents();

    }

    public void setPrice_in_cents(Integer price_in_cents) {
        this.price_in_cents = price_in_cents;
    }

    public void setName(String name) {
        this.name = name;
    }
}
