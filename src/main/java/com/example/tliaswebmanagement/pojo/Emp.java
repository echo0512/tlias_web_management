package com.example.tliaswebmanagement.pojo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer gender;//1:男，2:女
    private String phone;
    private Integer job;//职位, 1 班主任, 2 讲师 , 3 学工主管, 4 教研主管, 5 咨询师
    private Integer salary;
    private String image;
    private LocalDate entryDate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    //部门名称
    private String deptName;
}
