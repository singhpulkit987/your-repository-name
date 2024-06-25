package com.kubernetes.Koo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeService 
{
	@Autowired
	private Currency currency;
	
@GetMapping("/currency-exchange/from/{from}/to/{to}")
public Currency getService(@PathVariable String from, @PathVariable String to)
{
	currency.setFrom(from);
	currency.setTo(to);
	currency.setAmount(500);
	return currency;
}
}
