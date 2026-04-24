package com.example.tliaswebmanagement.service;

import com.example.tliaswebmanagement.pojo.Emp;
import com.example.tliaswebmanagement.pojo.PageResult;

public interface EmpService {

    PageResult<Emp> page(Integer page, Integer pageSize);
}
