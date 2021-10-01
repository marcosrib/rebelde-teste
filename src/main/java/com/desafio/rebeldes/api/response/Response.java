package com.desafio.rebeldes.api.response;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
	private T data;
	private List<String> errors;
	

	public Response(List<String> errors) {
		this.errors = errors;
	}
	

	public Response() {
	}

	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<>();
		}
		return this.errors;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
