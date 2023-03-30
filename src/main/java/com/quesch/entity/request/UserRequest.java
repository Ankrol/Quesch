package com.quesch.entity.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRequest implements Serializable {
    private String username;
    private String password;
}
