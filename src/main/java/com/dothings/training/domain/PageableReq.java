//package com.cpic.itworks.common.domain;
//
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort.Direction;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@ApiModel(value = "分页查询请求")
//public class PageableReq {
//
//	@ApiModelProperty(value = "当前页，默认第一页")
//	private int pageIndex = 1;
//	
//	@ApiModelProperty(value = "每页数量,默认10")
//	private int pageSize = 10;
//	
//	@ApiModelProperty(value = "排序规则：DESC、ASC，默认DESC")
//	private String direction = "DESC";
//	
//	@ApiModelProperty(value = "排序字段，默认lastUpdDate")
//	private String orderFields = "lastUpdDate";
//
//	@JsonIgnore
//	public Pageable getPageable() {
//		PageRequest pageRequest;
//		pageIndex--;
//		if(pageIndex < 0)pageIndex = 0;
//		if(pageSize < 1) pageSize = 10;
//		
//		if (direction != null) {
//			Direction direct = Direction.fromString(direction);
//			String[] properties = orderFields.split(",");
//			pageRequest = new PageRequest(pageIndex, pageSize, direct, properties);
//		} else {
//			pageRequest = new PageRequest(pageIndex, pageSize);
//		}
//		return pageRequest;
//	}
//	public int getPageIndex() {
//		return pageIndex;
//	}
//
//	public void setPageIndex(int pageIndex) {
//		this.pageIndex = pageIndex;
//	}
//
//	public int getPageSize() {
//		return pageSize;
//	}
//
//	public void setPageSize(int pageSize) {
//		this.pageSize = pageSize;
//	}
//
//	public String getDirection() {
//		return direction;
//	}
//
//	public void setDirection(String direction) {
//		this.direction = direction;
//	}
//
//	public String getOrderFields() {
//		return orderFields;
//	}
//
//	public void setOrderFields(String orderFields) {
//		this.orderFields = orderFields;
//	}
//	
//	
//}
