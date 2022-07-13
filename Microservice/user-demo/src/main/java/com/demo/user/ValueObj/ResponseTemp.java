package com.demo.user.ValueObj;

import com.demo.user.entity.user;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemp {

    // it contain both the service user and department.
    private user users;
    private DepEntity depEntity;
}
