package com.customerManagement.customermanagement.domain.ports.in.client;

import com.customerManagement.customermanagement.domain.models.Clients;

import java.util.List;
import java.util.Optional;

public interface RetrieveClientUseCase {
    Optional<Clients> getClientsById(Long id);
    List<Clients>getAllClients();
}
