package com.gareth.util;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.gareth.persistence.domain.Babies;
import com.gareth.persistence.domain.Baby;

@Component
public class BabyNameProducer {

	private Babies babies = new Babies();
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public String produce(Baby baby) 
	{
		babies.setName(baby.toString());
		jmsTemplate.convertAndSend("Baby Name", babies);
		return "Successfully added";
	}
}
