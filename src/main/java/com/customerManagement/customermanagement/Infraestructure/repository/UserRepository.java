package com.customerManagement.customermanagement.Infraestructure.repository;

import com.customerManagement.customermanagement.Infraestructure.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<Users,Long> {

}
