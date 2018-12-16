package com.dothings.training.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;


@Api("通用分页返回")
public class PageResp extends Status {
	@ApiModelProperty("分页")
	private Page<?> page;

	public PageResp(Page<?> page) {
		super();
		this.page = page;
	}

	public PageResp(Page<?> page, int success, String message) {
		super(success, message);
		this.page = page;
	}

	public int getCurrent() {
		return page.getCurrent();
	}

	public int getSize() {
		return page.getSize();
	}

	public long getPages() {
		return page.getPages();
	}

	public long getTotal() {
		return page.getTotal();
	}

	public List<?> getRecords() {
		return page.getRecords();
	}


}
