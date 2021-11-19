package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.dto.newsdto;

import lombok.var;

@Service
public class NewsApiService {
	
	
	@Autowired
	RestTemplate rt ;
	public 	newsdto getNewsDetails(String apikey) {
		return rt.getForObject("https://newsapi.org/v2/top-headlines?q=trump&"+apikey, newsdto.class);
	}

}
