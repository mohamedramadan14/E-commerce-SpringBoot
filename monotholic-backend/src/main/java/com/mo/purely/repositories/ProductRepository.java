package com.mo.purely.repositories;


import com.mo.purely.modals.Category;
import com.mo.purely.modals.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {

    List<Product> findByCategory(Category category);
    List<Product> findByProductNameContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrCategory_CategoryNameContainingIgnoreCase(String ProductName, String description, String categoryName);

}
