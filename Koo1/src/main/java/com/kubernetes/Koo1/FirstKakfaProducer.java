package com.kubernetes.Koo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class FirstKakfaProducer
{
	@Autowired
	KafkaTemplate<String,Integer> kt;
	
	Logger loggger = LoggerFactory.getLogger(FirstKakfaProducer.class);
public void produce(int value)
{
	kt.send("user_data",value);
	loggger.info("message produced {}",value);
}
}
