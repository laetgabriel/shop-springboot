package org.gabriellaet.project.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_product")
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    @Transient
    private Set<Category> categories = new HashSet<>();

    public Product(Long id, String name, String description, Double price, String imgUrl){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
}
