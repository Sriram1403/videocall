package com.sriram.videocall.Model;


import lombok.*;

@Data
@Builder
public class User {

    private String username;
    private String email;
    private String password;
    private String status;

}
