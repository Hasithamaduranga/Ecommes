package com.example.ecommes.Repository;


import com.example.ecommes.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {

    public Boolean existByName(String name);

    public List<Category> findByIsActiveTrue();

    Boolean existsByName(String name);
}
