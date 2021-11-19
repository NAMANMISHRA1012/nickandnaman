package com.user;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import ch.qos.logback.core.net.server.Client;

@SpringBootApplication
public class Newsappteam2Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Newsappteam2Application.class, args);
		
		
		}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
//		var url ="https://newsapi.org/docs/endpoints/top-headlines?country=us&apiKey=c8e429fdb1614e0a80a048bde81700fc";
//		var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
//		var client = HttpClient.newBuilder().build();
//		var response= client.send(request,HttpResponse.BodyHandlers.ofString());
//		System.out.println(response.statusCode());
//		System.out.println(response.body());
//		

//		// /v2/everything
//		newsApiClient.getEverything(
//		  new EverythingRequest.Builder()
//		          .q("trump")
//		          .build(),
//		  new NewsApiClient.ArticlesResponseCallback() {
//		      @Override
//		      public void onSuccess(ArticleResponse response) {
//		          System.out.println(response.getArticles().get(0).getTitle());
//		      }
//
//		      @Override
//		      public void onFailure(Throwable throwable) {
//		          System.out.println(throwable.getMessage());
//		      }
//		  }
//		);
//		        
//		// /v2/top-headlines
//		newsApiClient.getTopHeadlines(
//		  new TopHeadlinesRequest.Builder()
//		    .q("bitcoin")
//		    .language("en")
//		    .build(),
//		  new NewsApiClient.ArticlesResponseCallback() {
//		    @Override
//		    public void onSuccess(ArticleResponse response) {
//		      System.out.println(response.getArticles().get(0).getTitle());
//		    }
//
//		    @Override
//		    public void onFailure(Throwable throwable) {
//		      System.out.println(throwable.getMessage());
//		    }
//		  }
//		);
//		        
//		// /v2/top-headlines/sources
//		newsApiClient.getSources(
//		  new SourcesRequest.Builder()
//		    .language("en")
//		    .country("us")
//		    .build(),
//		  new NewsApiClient.SourcesCallback() {
//		    @Override
//		    public void onSuccess(SourcesResponse response) {
//		        System.out.println(response.getSources().get(0).getName());
//		    }
//
//		    @Override
//		    public void onFailure(Throwable throwable) {
//		      System.out.println(throwable.getMessage());
//		    }
//		  }
//		);
//	}
	
}

