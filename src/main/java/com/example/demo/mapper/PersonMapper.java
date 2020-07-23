package com.example.demo.mapper;


import com.example.demo.dao.PersonDao;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonMapper {

    //全部展示
    @Select("select * from pl")
    public List<PersonDao> getAllPerson();

    //查
    @Select("select * from pl where id =#{id}")
    public PersonDao getPersonById(int id);

    //删
    @Delete("delete * from pl where id =#{id}")
    public int delPersonById(int id);

    //增
    @Insert("insert into pl(id, name, gender, number) values(#{id}, #{name}, #{gender}, #{number})")
    public int InsertPerson(PersonDao personDao);

    //改
    @Update("update person set gender=#{gender}, name=#{name}, number=#{number} where id=#{id}")
    public int UpdatePerson(PersonDao personDao);
}
