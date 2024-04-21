package com.jzpacheco.cryptovalue.services;

import com.jzpacheco.cryptovalue.domains.currency.Currency;
import com.jzpacheco.cryptovalue.repositories.CurrencyRepository;
import com.jzpacheco.cryptovalue.services.externalCurrencyApiService.ExternalCurrencyApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CurrencyService {
    private CurrencyRepository repository;

    private ExternalCurrencyApiService externalService;

    @Autowired
    public CurrencyService(CurrencyRepository repository, ExternalCurrencyApiService externalService) {
        this.repository = repository;
        this.externalService = externalService;
    }

    public List<Currency> getAllCurrencies() {
        List<Currency> list = repository.getAll();

        list.forEach(item -> {
            try {
                item.setValue(Objects.requireNonNull(Currency.fromJson(externalService.getCurrencyValue(item.getName()), item.getName())).getValue());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        return repository.getAll();
    }

    public Currency addCurrency(String currency) throws Exception{
        String jsonCurrency = externalService.getCurrencyValue(currency);
        Currency entity = Currency.fromJson(jsonCurrency,currency);
        return repository.postData(entity);
    }
}
