package com.dothings.training.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;

@ApiModel(value = "分页查询请求")
public abstract class PageReq<T> {

	@ApiModelProperty(value = "当前页，默认第一页")
	private int current = 1;
	
	@ApiModelProperty(value = "每页数量,默认10")
	private int size = 10;
	
	@ApiModelProperty(value = "排序规则：DESC、ASC，默认DESC")
	private String direction = "DESC";
	
	@ApiModelProperty(value = "排序字段，默认lastUpdDate")
	private String orderByField = "id";
	@JsonIgnore
	public abstract Map<String, Object> getQueryParams();

	@JsonIgnore
	public Page<T> getPage() {
		Page<T> page=new Page<>(current, size,orderByField, !"DESC".equals(direction));
		page.setCondition(getQueryParams());
		return page;
	}
	

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getOrderByField() {
		return orderByField;
	}

	public void setOrderByField(String orderByField) {
		this.orderByField = orderByField;
	}

	
	
	
}
