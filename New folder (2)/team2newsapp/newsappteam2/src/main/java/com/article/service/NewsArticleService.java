package com.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.article.model.NewsArticle;

@Service
public class NewsArticleService {
    
	@Autowired
	NewsArticle newsArticle;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public NewsArticle  getNewsArticleObject(String country) {
		 
	}
	
}
