package com.tjufe.manage.dataObject;

import lombok.Data;

import java.util.Date;
@Data
public class SellerInfo {
    private String sellerId;

    private String username;

    private String password;

    private String openid;

    private Date createTime;

    private Date updateTime;

    private Integer tel;

    private String email;

    private Integer score;

    private String IP;
}