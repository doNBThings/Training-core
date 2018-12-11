//package com.cpic.itworks.common.domain;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiModelProperty;
//
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//
//@Api("通用分页返回")
//public class PageResp extends Status {
//	@ApiModelProperty("分页")
//	private Page<?> page;
//
//	public PageResp(Page<?> page) {
//		super();
//		this.page = page;
//	}
//
//	public PageResp(Page<?> page, int success, String message) {
//		super(success, message);
//		this.page = page;
//	}
//
//	public int getPageIndex() {
//		return page.getNumber();
//	}
//
//	public int getPageSize() {
//		return page.getSize();
//	}
//
//	public int getTotalPages() {
//		return page.getTotalPages();
//	}
//
//	public long getTotalSize() {
//		return page.getTotalElements();
//	}
//
//	public List<?> getContent() {
//		return page.getContent();
//	}
//
//	public boolean hasContent() {
//		return page.hasContent();
//	}
//
//}
