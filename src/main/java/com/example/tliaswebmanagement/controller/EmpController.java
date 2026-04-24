package com.example.tliaswebmanagement.controller;

import com.example.tliaswebmanagement.mapper.EmpMapper;
import com.example.tliaswebmanagement.pojo.Emp;
import com.example.tliaswebmanagement.pojo.PageResult;
import com.example.tliaswebmanagement.pojo.Result;
import com.example.tliaswebmanagement.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/emps")
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

//    @RequestParam: 将请求参数绑定到方法参数上。
//    defaultValue: 设置参数的默认值。如果前端未传递 page 或 pageSize，
//    则分别默认为 1 和 10，避免空指针异常并提供合理的分页起始状态。

    //分页查询员工数据
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize) {
        PageResult<Emp> pageResult = empService.page(page, pageSize);//获取分页数据
        return Result.success(pageResult);
    }
}
