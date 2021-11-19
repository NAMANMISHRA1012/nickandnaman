package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.newsdto;
import com.user.service.NewsApiService;

import lombok.var;

@RestController
@RequestMapping("/newsapi")
public class NewsApiController {
	@Autowired
	NewsApiService service;

		@GetMapping("/{apikey}")
	public newsdto GetNewsDetails(@PathVariable String apikey) {
		return  service.getNewsDetails(apikey);
	}
}
