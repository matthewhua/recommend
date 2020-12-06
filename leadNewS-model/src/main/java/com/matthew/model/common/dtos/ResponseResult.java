package com.matthew.model.common.dtos;

import com.matthew.model.common.enums.AppHttpCodeEnum;

import java.io.Serializable;

/**
 * @author Matthew
 * @date 2020/10/24 10:06
 */
public class ResponseResult<T> implements Serializable
{
	private String host;

	private Integer code;

	private String errorMessage;

	private T data;

	/**
	 * 正常情况下 返回200
	 */
	public ResponseResult()
	{
		this.code = 200;
	}

	public ResponseResult(Integer code, T data) {
		this.code = code;
		this.data = data;
	}

	public ResponseResult(Integer code, String msg, T data) {
		this.code = code;
		this.errorMessage = msg;
		this.data = data;
	}

	public ResponseResult(Integer code, String msg) {
		this.code = code;
		this.errorMessage = msg;
	}

	public static ResponseResult errorResult(int code, String msg)
	{
		ResponseResult responseResult = new ResponseResult();
		return responseResult.error(code, msg);
	}

	public static ResponseResult errorResult(AppHttpCodeEnum codeEnum, String errorMessage)
	{
		return setAppHttpCodeEnum(codeEnum, errorMessage);
	}


	public static ResponseResult okResult(int code, String msg) {
		ResponseResult result = new ResponseResult();
		return result.ok(code, null, msg);
	}

	public static ResponseResult okResult(Object data) {
		ResponseResult result = setAppHttpCodeEnum(AppHttpCodeEnum.SUCCESS, AppHttpCodeEnum.SUCCESS.getMessage());
		if(data!=null) {
			result.setData(data);
		}
		return result;
	}

	public static ResponseResult setAppHttpCodeEnum(AppHttpCodeEnum enums){
		return okResult(enums.getCode(),enums.getMessage());
	}

	private static ResponseResult setAppHttpCodeEnum(AppHttpCodeEnum enums, String errorMessage){
		return okResult(enums.getCode(),errorMessage);
	}

	public static ResponseResult errorResult(AppHttpCodeEnum enums)
	{
		return setAppHttpCodeEnum(enums,enums.getMessage());
	}

	public ResponseResult<?> error(Integer code, String msg)
	{
		this.code = code;
		this.errorMessage = msg;
		return this;
	}

	public ResponseResult<?> ok(Integer code, T data) {
		this.code = code;
		this.data = data;
		return this;
	}

	public ResponseResult<?> ok(Integer code, T data, String msg) {
		this.code = code;
		this.data = data;
		this.errorMessage = msg;
		return this;
	}

	public ResponseResult<?> ok(T data) {
		this.data = data;
		return this;
	}
	public String getHost()
	{
		return host;
	}

	public void setHost(String host)
	{
		this.host = host;
	}

	public Integer getCode()
	{
		return code;
	}

	public void setCode(Integer code)
	{
		this.code = code;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	public T getData()
	{
		return data;
	}

	public void setData(T data)
	{
		this.data = data;
	}
}
