package com.customerManagement.customermanagement.infraestructure.repositories.port;

import com.customerManagement.customermanagement.domain.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Products,Long> {

}
