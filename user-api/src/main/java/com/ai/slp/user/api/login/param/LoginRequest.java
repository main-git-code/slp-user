package com.ai.slp.user.api.login.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 登录服务入参 Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class LoginRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户类型 不能为空
     */
    @NotNull(message = "用户类型不能为空")
    private String userType;

    /**
     * 用户登陆用户名
     */
    private String userLoginName;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户手机号
     */
    private String userMp;

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMp() {
        return userMp;
    }

    public void setUserMp(String userMp) {
        this.userMp = userMp;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
