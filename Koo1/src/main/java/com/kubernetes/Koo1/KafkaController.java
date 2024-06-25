package com.kubernetes.Koo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class KafkaController 
{
	@Autowired
	FirstKakfaProducer kp;
	
	@GetMapping("/produce/value")
public int send()
{
	int value = (int) (Math.random()*100);
	kp.produce(value);
	return value;
}
}
