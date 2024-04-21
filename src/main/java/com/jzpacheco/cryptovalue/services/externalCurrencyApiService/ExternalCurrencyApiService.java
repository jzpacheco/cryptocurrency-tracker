package com.jzpacheco.cryptovalue.services.externalCurrencyApiService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


@Service
public class ExternalCurrencyApiService implements ExternalCurrencyApiInterface{

    private  RestClient client = RestClient.create("https://min-api.cryptocompare.com/data");


    public ExternalCurrencyApiService(@Value("${external.api-currency.key}") String apiKey) {
        this.client.get().header("apiKey", apiKey);
    }

    @Override
    public String getCurrencyValue(String currency_name) throws Exception {

            return client.get().uri(uriBuilder -> uriBuilder.path("/price")
                            .queryParam("fsym",currency_name)
                            .queryParam("tsyms","USD")
                            .build())
                    .retrieve().toEntity(String.class).getBody();

    }
}
