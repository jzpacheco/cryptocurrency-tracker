package com.jzpacheco.cryptovalue.controllers;


import com.jzpacheco.cryptovalue.domains.currency.Currency;
import com.jzpacheco.cryptovalue.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/currency/v1/")
public class CurrencyController {

    @Autowired
    private CurrencyService service;

    @GetMapping
    public ResponseEntity<List<Currency>> getAllCurrencies(){
        try {
            List<Currency> currencies = service.getAllCurrencies();
            return ResponseEntity.ok(currencies);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/addCurrency")
    public ResponseEntity<Currency> addCurrency(@RequestParam String name){
        try{
            System.out.println(name);
            Currency currency =  service.addCurrency(name);
            return ResponseEntity.ok(currency);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
