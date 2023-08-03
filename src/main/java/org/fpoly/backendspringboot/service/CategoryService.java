package org.fpoly.backendspringboot.service;

import org.fpoly.backendspringboot.model.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Optional<List<Category>> findAll();
}
