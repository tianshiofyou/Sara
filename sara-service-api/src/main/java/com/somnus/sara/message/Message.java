package com.somnus.sara.message;

import org.hibernate.validator.constraints.NotEmpty;

public class Message implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//发送系统编号
	@NotEmpty
    private String sysCode;
    //前置机编号
    @NotEmpty
    private String frontNo;
    //前置机时间
    @NotEmpty
    private String frontTime;
    //响应码
    private String repCode;
    //响应消息
    private String repMsg;

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getRepMsg() {
        return repMsg;
    }

    public void setRepMsg(String repMsg) {
        this.repMsg = repMsg;
    }

    public String getFrontTime() {
        return frontTime;
    }

    public void setFrontTime(String frontTime) {
        this.frontTime = frontTime;
    }

    public String getRepCode() {
        return repCode;
    }

    public void setRepCode(String repCode) {
        this.repCode = repCode;
    }

    public String getFrontNo() {
        return frontNo;
    }

    public void setFrontNo(String frontNo) {
        this.frontNo = frontNo;
    }
}
