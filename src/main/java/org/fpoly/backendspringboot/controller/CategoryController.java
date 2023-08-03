package org.fpoly.backendspringboot.controller;

import org.fpoly.backendspringboot.model.entity.Category;
import org.fpoly.backendspringboot.model.entity.Product;
import org.fpoly.backendspringboot.service.CategoryService;
import org.fpoly.backendspringboot.service.ProductService;
import org.fpoly.backendspringboot.service.impl.CategoryServiceImpl;
import org.fpoly.backendspringboot.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(    "api/v1/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        return categoryService.findAll().map(categories -> new ResponseEntity<>(categories, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("{id}/products")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable Long id) {
        return productService.getProductsByCategory(id).map(products -> new ResponseEntity<>(products, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
