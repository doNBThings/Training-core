package com.dothings.training.domain;

import java.util.Collection;

public class ListResp extends Status {
	private Collection<?> values;

	
	public ListResp() {
		super();
	}

	public ListResp(Collection<?> values) {
		super();
		this.values = values;
	}

	public Collection<?> getValues() {
		return values;
	}

	public void setValues(Collection<?> values) {
		this.values = values;
	}

}
