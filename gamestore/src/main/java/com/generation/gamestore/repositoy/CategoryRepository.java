package com.generation.gamestore.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.gamestore.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	public List <Category> findAllByCategoryContainingIgnoreCase(@Param("category") String category);
}
