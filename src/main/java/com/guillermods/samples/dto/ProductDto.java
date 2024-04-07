package com.guillermods.samples.dto;

import java.math.BigDecimal;

public record ProductDto(String productName, BigDecimal price, Integer stock) {

}
