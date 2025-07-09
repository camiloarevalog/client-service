package com.supermarket.clients.Controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "client/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {


    public ClientController(){

    }

    /**
     * HTTP POST request to save a new customer.
     * @param clientRequestDto contain the information of client to save
     * @return clientResponseDto created in the body of the response HTTP
     */
    @PostMapping
    private ResponseEntity<ClientResponseDto>saveClient(@Valid @RequestBody ClientRequestDto clientRequestDto){
return new ResponseEntity<>(clientServiceInterfaz.saveClient(clientRequestDto.toModel()), HttpStatus.CREATED);
    }

}
