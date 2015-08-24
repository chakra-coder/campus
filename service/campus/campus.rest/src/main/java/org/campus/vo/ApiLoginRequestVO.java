package org.campus.vo;

import org.campus.model.enums.ApiType;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ApiLoginRequestVO", description = "第三方登录信息")
public class ApiLoginRequestVO {

    private String code;

    private String redirectUrl;

    private ApiType apiType;

    @ApiModelProperty(value = "qq、微博、微信授权返回的code", required = true)
    public String getCode() {
        return code;
    }

    @ApiModelProperty(value = "qq、微博、微信授权返回的code", required = true)
    public void setCode(String code) {
        this.code = code;
    }

    @ApiModelProperty(value = "回调地址，微博、qq认证需传递", required = false)
    public String getRedirectUrl() {
        return redirectUrl;
    }

    @ApiModelProperty(value = "回调地址，微博、qq认证需传递", required = false)
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    @ApiModelProperty(value = "第三方类型", required = true)
    public ApiType getApiType() {
        return apiType;
    }

    @ApiModelProperty(value = "第三方类型", required = true)
    public void setApiType(ApiType apiType) {
        this.apiType = apiType;
    }

}