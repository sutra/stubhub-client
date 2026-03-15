package org.oxerr.stubhub.client.model;

import java.util.List;
import java.util.Map;

public class ErrorResource {

	private String code;

	private String message;

	private Map<String, List<String>> errors;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, List<String>> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, List<String>> errors) {
		this.errors = errors;
	}

}
