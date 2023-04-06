package com.quesch.entity.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChangeInfoRrequest implements Serializable {
    private String id;
    private String username;
    private String password;
}
