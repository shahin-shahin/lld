package com.shahin.lld.creationaldesionpattern.builderdesignpattern.anotherexample;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class User {
    private String username;
    private String email;
    private String password;
}