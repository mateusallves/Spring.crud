package com.example.crud.controlers;

import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.ProductRepository;
import com.example.crud.domain.product.RequestProductDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@SuppressWarnings("ALL")
@RestController
@RequestMapping("/products")
public class productController {
    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity getAllProducts() {
        var allProducts = repository.findAll();

        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProductDTO data) {
        Product product = new Product(data);
        System.out.println(data);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/id")
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProductDTO data) {
        Product product = repository.getReferenceById(data.id());


        return ResponseEntity.ok(product);
    }
}
