package com.customerManagement.customermanagement.domain.ports.in.client;

import com.customerManagement.customermanagement.domain.models.Clients;

public interface CreateClientUseCase {
    Clients createClients(Clients clients);

}
