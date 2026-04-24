package com.example.tliaswebmanagement.controller;

import com.example.tliaswebmanagement.pojo.Dept;
import com.example.tliaswebmanagement.pojo.Result;
import com.example.tliaswebmanagement.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/depts")
@RestController //所有方法返回值直接作为 HTTP 响应体（自动序列化为 JSON）
public class DeptController {
    @Autowired
    private DeptService deptService;
    //@RequestMapping(value = "/depts",method = RequestMethod.GET)//将 HTTP 请求路径 /depts 映射到 list() 方法，指定请求方法为 GET

    //获取部门列表
    @GetMapping
    public Result list() {
        //输出日志
        System.out.println("查询所有部门列表");
        //调用service方法获取数据，此时需要一个DeptService类并自动注入
        List<Dept> list = deptService.findAll();
        return Result.success(list);
    }

    //删除部门
    @DeleteMapping
    public Result delete(@RequestParam("id") Integer deptId) {
        System.out.println("删除部门");
        deptService.deleteById(deptId);
        return Result.success();
    }

    //添加部门
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        System.out.println("添加部门");
        deptService.add(dept);
        return Result.success();
    }

    //查询部门详情
    @GetMapping("/{id}")
    public Result getInfo(@PathVariable("id") Integer deptId) {
        System.out.println("查询部门详情");
        Dept dept = deptService.findById(deptId);
        return Result.success(dept);
    }

    @PutMapping
    public Result update(@RequestBody Dept dept) {
        System.out.println("更新部门");
        deptService.update(dept);
        return Result.success();
    }
}
