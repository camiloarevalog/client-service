package com.supermarket.clients.Service;

import com.supermarket.clients.Dto.Response.ClientResponseDto;
import com.supermarket.clients.Model.Client;

public interface ClientService {

    public ClientResponseDto saveClient(Client client);
}
