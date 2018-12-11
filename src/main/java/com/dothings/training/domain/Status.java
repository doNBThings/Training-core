package com.dothings.training.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(value = "通用消息提醒返回")
public class Status {
	@ApiModelProperty(value = "消息代码，大于100小于999，含义参照HTTP Status", required = true)
	private int success = 200;// 大于100小于999

	@ApiModelProperty(value = "消息正文", required = true)
	private String message = null;

//	@Transient
//	@ApiModelProperty(value = "调试堆栈")
//	private StackTraceElement[] stackTrace;

	public Status() {
		super();
	}

	public Status(int success) {
		super();
		this.success = success;
	}

	public Status(int success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public int getSuccess() {
		return success;
	}

	public void setSuccess(int success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	public StackTraceElement[] getStackTrace() {
//		return stackTrace;
//	}
//
//	public void setStackTrace(StackTraceElement[] stackTrace) {
//		this.stackTrace = stackTrace;
//	}

}
