package com.personamicro2.personamicro2.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.personamicro2.personamicro2.entity.Item;
import com.personamicro2.personamicro2.entity.Persona;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> finAll() {
        List<Persona> personas = Arrays
                .asList(clienteRest.getForObject("http://localhost:8010/lista5", Persona[].class));
        return personas.stream().map(p -> new Item(p)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id) {
        Persona personas = clienteRest.getForObject("http://localhost:8010/lista5/{id}", Persona.class, id);

        if (personas != null) {
            return new Item(personas);
        } else {
            return null;
        }
    }
    
}
