package com.verizon.search.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/search/{id}")
public class SearchRestController {
@RequestMapping
public String consumeMessage() {
	RestTemplate resttemplate=new RestTemplate();
	String response=resttemplate.getForObject("http://localhost:8966/customer-service/customer/1", String.class);
	return response;
}
}
