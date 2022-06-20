package com.revature.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// An entity is just some data/model we're storing
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    // normally, we use Longs for ids:
    private Long id;
    private String username;
    private String password;

}
