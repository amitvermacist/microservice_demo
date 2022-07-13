package com.demo.user.ValueObj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepEntity {
//cretae a class from contain the information from previous service
    private Long DepID;
    private  String DepName;
    private String DepAdd;
    private  String DepCode;

}
