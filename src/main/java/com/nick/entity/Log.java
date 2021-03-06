package com.nick.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 日志类
 * Created by nick on 2017/7/15.
 *
 */
@Table(name = "log")
public class Log {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    @NotNull
    private String fun;

    private String logDescription;

    @NotNull
    private Date operationTime;   //操作时间

    private String params; //方法参数

    private String ipAddress; //访问ip

    private Long operationTimes; //操作时长

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFun() {
        return fun;
    }

    public void setFun(String fun) {
        this.fun = fun;
    }

    public String getLogDescription() {
        return logDescription;
    }

    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Long getOperationTimes() {
        return operationTimes;
    }

    public void setOperationTimes(Long operationTimes) {
        this.operationTimes = operationTimes;
    }
}
