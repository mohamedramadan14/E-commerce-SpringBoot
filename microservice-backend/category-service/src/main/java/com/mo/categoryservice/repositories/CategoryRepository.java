package com.mo.categoryservice.repositories;

import com.mo.categoryservice.modals.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {
   boolean existsByCategoryName(String categoryName);

}
