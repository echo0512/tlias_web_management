package com.example.tliaswebmanagement.mapper;

import com.example.tliaswebmanagement.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    //查询所有部门列表
    @Select("select id, name, create_time, update_time from dept order by update_time desc")
    List<Dept> findAll();

    //根据id删除部门
    @Delete("delete from dept where id = #{deptId}")
    void deleteById(Integer deptId);

    //添加部门
    @Insert("insert into dept(name, create_time, update_time) values (#{name}, #{createTime}, #{updateTime})")
    void insert(Dept dept);

    //根据id查询部门
    @Select("select id, name, create_time, update_time from dept where id = #{deptId}")
    Dept findById(Integer deptId);

    //修改部门
    @Insert("update dept set name = #{name}, update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);
}
