package com.dothings.training.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "localizedMessage", "cause", "suppressed", "model" })
public class MessageException extends RuntimeException {
	private static final long serialVersionUID = 2055027743883945241L;
	private Status model = new Status();

	public Status getModel() {
		return model;
	}

	public MessageException() {
		super();
	}

	public MessageException(int errCode) {
		super(errCode + "/unknown");
		this.model.setSuccess(errCode);
	}

	public MessageException(int errCode, String errMsg) {
		super(errCode + "/" + errMsg);
		this.model.setSuccess(errCode);
		this.model.setMessage(errMsg);
	}

	public MessageException(int errCode, String errMsg, StackTraceElement[] stackTrace) {
		super(errCode + "/" + errMsg);
		this.model.setSuccess(errCode);
		this.model.setMessage(errMsg);
		this.setStackTrace(stackTrace);
	}

	public MessageException(int errCode, String errMsg, Throwable exception) {
		super(errCode + "/" + errMsg, exception);
	}

	public int getSuccess() {
		return this.model.getSuccess();
	}

	public String getMessage() {
		return this.model.getMessage();
	}
}
