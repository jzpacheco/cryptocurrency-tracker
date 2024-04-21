package com.jzpacheco.cryptovalue.repositories;


 import com.jzpacheco.cryptovalue.domains.currency.Currency;
 import org.springframework.stereotype.Repository;

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;

 @Repository
public class CurrencyRepository {
    private Map<String, Currency> data = new HashMap<>();

    public List<Currency> getAll(){
        return new ArrayList<>(data.values());
    }

    public Currency postData(Currency input){
        this.data.put(input.getName(), input);
        return data.get(input.getName());
    }
}
