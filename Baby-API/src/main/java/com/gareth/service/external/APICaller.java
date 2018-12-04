package com.gareth.service.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.gareth.persistence.domain.Baby;
import com.gareth.util.BabyNameProducer;

@Component
public class APICaller {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private BabyNameProducer producer;

	@Value("http://localhost:8082/generate")
	private String babyURL;

	public String getBabyName() {
		return restTemplate.getForObject(babyURL, String.class);
	}

	public void persist(Baby baby) {
		producer.produce(baby);
	}

}
