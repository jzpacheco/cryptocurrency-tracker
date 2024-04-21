package com.jzpacheco.cryptovalue.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/currency/v1/")
public class CurrencyController {


    @GetMapping
    public List<Currency>
}
