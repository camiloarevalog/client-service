package com.supermarket.clients.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Builder
public class Client {

    private Long id;
    private String firstName;
    private String email;
    private String phone;
    private String address;
    private String birthday;
    private Boolean active;
    private LocalDate registrationDate;
}
