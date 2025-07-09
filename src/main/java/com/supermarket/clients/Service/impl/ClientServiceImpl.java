package com.supermarket.clients.Service.impl;

import com.supermarket.clients.Model.Client;
import com.supermarket.clients.Service.ClientService;
import com.supermarket.clients.repository.ClientRepository;

public class ClientServiceImpl implements ClientService {

private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientResponseDto save(Client client) {
        return null;
    }
}
