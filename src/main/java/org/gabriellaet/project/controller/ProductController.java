package org.gabriellaet.project.controller;

import org.gabriellaet.project.models.entities.Product;
import org.gabriellaet.project.models.entities.User;
import org.gabriellaet.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> products = productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id){
        Product product = productService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }
}
