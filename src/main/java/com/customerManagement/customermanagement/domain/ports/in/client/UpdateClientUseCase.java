package com.customerManagement.customermanagement.domain.ports.in.client;

import com.customerManagement.customermanagement.domain.models.Clients;

import java.util.Optional;

public interface UpdateClientUseCase {
    Optional<Clients>updateClients(Long id, Clients updateClients);
}
