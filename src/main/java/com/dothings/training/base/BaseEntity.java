package com.dothings.training.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;

@ApiModel(value = "通用消息提醒返回")
public abstract class BaseEntity<T extends Model>  extends Model<T>{
	@ApiModelProperty(value = "消息代码，大于100小于999，含义参照HTTP Status", required = true)
	@TableField(exist = false)
	private int success = 200;// 大于100小于999
	@TableField(exist = false)
	@ApiModelProperty(value = "消息正文", required = true)
	private String message = null;

//	@Transient
//	@ApiModelProperty(value = "调试堆栈")
//	private StackTraceElement[] stackTrace;

	public BaseEntity() {
		super();
	}

	public BaseEntity(int success) {
		super();
		this.success = success;
	}

	public BaseEntity(int success, String message) {
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
}
