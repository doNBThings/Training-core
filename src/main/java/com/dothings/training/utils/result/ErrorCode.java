package com.dothings.training.utils.result;

import java.util.Objects;

public enum ErrorCode {
	PARAM_ERROR(30001,"参数解析错误"),
	EXIGST_ERROR(30002,"重复添加"),
	USER_ERROR(30003,"用户不存在"),
	PWD_ERROR(30004,"用户或密码错误"),
	GET_CODE_ERROR(30005,"获取短信验证码失败"),
	MCODE_ERROR(30006,"短信验证码错误"),
	UPLOAD_ERROR(30007,"上传文件出错"),
	ERROR_MODIFY_OUTCOME(30042,"成果不存在或不是本人发布的成果"),
	QUALIFICATION_ERROR(30008,"资格验证失败"),
	NO_BID(30009,"竞拍结束"),
	NON_SELF(30010,"非本人"),
	FIELD_CANNOT_BE_EMPTY(30011,"字段不能为空"),
	RETURN_NULL_POINTER(30012,"返回空指针"),
	NOT_IN_TIME(30013,"不在时间内"),
	COMMON_TYPE_ERROR(30014,"通用模块参数错误"),
	FILE_NOT_EXIST(30015,"文件不存在"),
	DOWNLOAD_ERROR(30016,"下载错误"),
	FORMAT_CONVERSION_ERROR(30017,"格式转化错误"),
	SHARE_SESSION_ERROR(30018,"获取共享session失败"),
	ACCOUNT_ERROR(30019,"账户不存在"),
	UNSELECTED_LABEL(30020,"未选标"),
	USER_FIELD_ERROR(30021,"注册用户主要字段为空"),
	TELEPHON_REGEX_ERROR(30022,"手机格式不正确"),
	NOT_LOGGED(30023,"未登录"),
	BEAN_NULL(30024,"bean为空"),
	SUPPLIER_NULL(30025,"机构服务为空"),
	TELEPHONE_EXIST(30026,"手机已经注册"),
	SUPPLIERAPTITUDE_NULL(30027,"机构资质为空"),
	TELEPHONE_PASSWORD_NULL(30028,"手机或密码不能为空"),
	ALREADY_SUPPLIER(30029,"已经有过机构标签了"),
	ALREADY_EXPERT(30030,"已经有过机构标签了"),
	NOT_APPLY_YOURSELF_REQUIRE(30031,"不能申请自己发布的需求"),
	NOT_APPLY_YOURSELF_SCHEME(30032,"不能申请自己发布的方案"),
	SERVICETYPE_OR_SUPPLIERID_NONE(30033,"机构类型或者机构id为空"),
    LOGIN_WRITE_FAIL(30034,"登陆写入缓存失败"),
	PATENT_FOLLOW_MAX_COUNT(30035,"收藏专利数量已满"),
	NOT_SUPPLIER(30036,"机构不存在"),
	NOT_SUPPLIER_BUT_SUPPLIER_SERVICE_LIVE(30037,"无机构服务"),
	NOT_SUPPLIER_MASTER_NOT_DELETE(30038,"非机构主不能修改机构服务"),
	NOT_OUTCOME_EXIST(30039,"响应成果不存在"),
	NOT_OUTCOME_STATUS_ERROR(30040,"非进行中成果不可响应"),
	NOT_APPLY_YOURSELF_OUTCOME(30041,"不能响应自己发布的成果"),
	NOT_APPLY_OUTCOME_AGENT(30042,"不能重复响应成果"),
	NOT_FIND_MD5(30043,"找不到md5算法"),
	LOGOUT_USEID_TOKEN_NULL(30044,"注销中用户主键或者token为空"),
	LOGOUT_USEID_TOKEN_NOT_GROUP(30045,"注销中用户主键和token非一组"),
	USEID_TOKEN_NOT_NULL(30046,"用户主键或者token为空"),
	USEID_TOKEN_NOT_MATCHING(30047,"用户主键和者token不匹配"),
	SEND_MOBILE_CODE_ERROR(30048,"发送短信验证码失败"),
	CHECK_MOBILE_CODE_ERROR(30049,"短信验证码错误"),
	USER_STATUS_ERROR(30050,"用户状态错误"),
	JSON_ERROR(40001,"JSON转换失败"),
	VERIFY_ERROR(50001,"验证失败"),
	USER_RIGHT_ERROR(60001,"权限不足"),
	NOT_ENOUGH(70001,"剩余使用次数不足，请充值"),
	HTTP_ERROR(80001,"HTTP相关错误"),
	SERVICE_ERROR(90000,"服务端内部错误"),
	REMOTE_SERVICE_PARSE_ERROR(90001,"远程数据解析错误"),
	REMOTE_SERVICE_ERROR(90002,"远程服务错误");

	private Integer code;
	private String errorInfo;

	private ErrorCode(Integer code,String errorInfo){
		this.code = code ;
		this.errorInfo = errorInfo;
	}

	public int getErrorCode() {
		return code;
	}

	public String getInfo() {
		return toString();
	}

	@Override
	public String toString() {
		return errorInfo;
	}

	public static ErrorCode fromErrorCode(Integer code){
		for (ErrorCode error : ErrorCode.values()) {
			if (Objects.equals(code,error.getErrorCode())) {
				return error;
			}
		}
		return null;
	}

}
