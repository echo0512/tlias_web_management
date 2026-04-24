package com.example.tliaswebmanagement.mapper;

import com.example.tliaswebmanagement.pojo.Emp;
import com.example.tliaswebmanagement.pojo.PageResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//员工工作经历操作接口
@Mapper
public interface EmpMapper {

    //查询总记录数
    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id")
    public Long count();

    //分页查询
    @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id order by e.update_time desc limit #{start}, #{pageSize}")
    public List<Emp> list(Integer start,Integer pageSize);

}
