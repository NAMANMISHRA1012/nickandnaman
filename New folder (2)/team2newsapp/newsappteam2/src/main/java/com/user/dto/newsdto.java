package com.user.dto;

import org.hibernate.mapping.Array;

public class newsdto {
	private String status;
	private int totalResults;
	private Array articles;
	public newsdto(String status, int totalResults, Array articles) {
		super();
		this.status = status;
		this.totalResults = totalResults;
		this.articles = articles;
	}
	public newsdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	public Array getArticles() {
		return articles;
	}
	public void setArticles(Array articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "newsdto [status=" + status + ", totalResults=" + totalResults + ", articles=" + articles + "]";
	}
	
	
}
