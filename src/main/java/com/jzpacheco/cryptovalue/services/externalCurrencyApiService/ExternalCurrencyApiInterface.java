package com.jzpacheco.cryptovalue.services.externalCurrencyApiService;


public interface ExternalCurrencyApiInterface {

    String getCurrencyValue(String currency_name) throws Exception;
}
