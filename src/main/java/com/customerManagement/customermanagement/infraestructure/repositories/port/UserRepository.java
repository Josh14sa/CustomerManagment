package com.customerManagement.customermanagement.infraestructure.repositories.port;

import com.customerManagement.customermanagement.domain.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<Users,Long> {

}
