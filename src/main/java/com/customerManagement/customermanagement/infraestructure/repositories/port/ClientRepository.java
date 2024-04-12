package com.customerManagement.customermanagement.infraestructure.repositories.port;

import com.customerManagement.customermanagement.domain.models.Clients;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ClientRepository  extends MongoRepository<Clients,Long> {
}
