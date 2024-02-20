package com.example.demo.service;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    private List<Address> addresses = new ArrayList<>();

    public void addAddress(Address addressA) {
        addresses.add(addressA);
    }
}
