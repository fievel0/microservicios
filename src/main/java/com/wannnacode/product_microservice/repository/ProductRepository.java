package com.wannnacode.product_microservice.repository;

import com.wannnacode.product_microservice.entity.ProductEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository <ProductEntity, String> {

}
