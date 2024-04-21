package com.jzpacheco.cryptovalue.domains.currency;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Currency {
    private String name;
    private Float value;

    public Currency(String name, Float value) {
        this.name = name;
        this.value = value;
    }

    public static  Currency fromJson(String json, String currency_name) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Map<String, String> map = objectMapper.readValue(json, new TypeReference<Map<String, String>>() {
            });
            Map.Entry<String, String> entry = map.entrySet().iterator().next();
            return new Currency(currency_name, Float.parseFloat(entry.getValue()));
        } catch (Exception e){
            System.out.println(e.toString());
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
