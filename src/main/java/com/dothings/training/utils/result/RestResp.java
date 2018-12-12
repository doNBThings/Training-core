package com.dothings.training.utils.result;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class RestResp<T> {
	
	private Integer code = 200;
	private String msg = "";
	private RestData<T> data = null;
	private Long tt;
//	用户的accesss的token。
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public RestResp() {
		
	}
	
	public RestResp(Long tt){
		this.tt = tt;
	}
	
	public RestResp(Integer code, Long tt){
		this(code,null,tt);
	}
	
	public RestResp(Integer code,String msg,Long tt){
		this.code = code;
		this.msg = msg == null?ErrorCode.fromErrorCode(code).toString():msg;
		this.tt = tt;
	}
	
	public RestResp(T data, Long tt){
		this(data==null?new RestData<T>(new ArrayList<T>()):new RestData<T>(data),tt);
	}
	
	public RestResp(List<T> data, Long tt){
		this(data==null?new RestData<T>(new ArrayList<T>()):new RestData<T>(data),tt);
	}
	
	public RestResp(List<T> data, Long count, Long tt){
		this(data,tt);
		this.data.setRsCount(count);
	}
	
	public RestResp(List<T> data, Integer count, Long tt){
		this(data,tt);
		this.data.setRsCount(Long.valueOf(count));
	}
	
	public RestResp(RestData<T> data, Long tt){
		this.data = data==null?new RestData<T>(new ArrayList<T>()):data;
		this.tt = tt;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public RestData<T> getData() {
		return data;
	}

	public void setData(RestData<T> data) {
		this.data = data;
	}

	public Long getTt() {
		return tt;
	}

	public void setTt(Long tt) {
		this.tt = tt;
	}
	
	

	
}
