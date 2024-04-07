package com.guillermods.samples.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guillermods.samples.dto.ProductDto;

@RestController
@RequestMapping("/api")
public class ProductsController {

    @GetMapping
    public List<ProductDto> get() {

        
        return List.of(new ProductDto("Coffemaker", BigDecimal.valueOf(45), 4),
                new ProductDto("Mug", BigDecimal.valueOf(9), 70));
    }
}
