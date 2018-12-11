package com.dothings.training.domain;

import java.util.Map;

public class MapResp extends Status{
	
	private Map<String, Object> values;
	
	public MapResp() {
		super();
	}

	public MapResp(Map<String, Object> values) {
		super();
		this.values = values;
	}

	public Map<String, Object> getValues() {
		return values;
	}

	public void setValues(Map<String, Object> values) {
		this.values = values;
	}
	
}
