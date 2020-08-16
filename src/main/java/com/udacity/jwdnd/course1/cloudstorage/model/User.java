package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String userName;
    private String salt;
    private String password;
    private String firstName;
    private String lastName;
}
