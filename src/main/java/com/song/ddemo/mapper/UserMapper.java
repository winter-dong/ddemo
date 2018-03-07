package com.song.ddemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.song.ddemo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where name = #{name}")
    User findByName(@Param("name") String name);

    int insert(@Param("name") String name, @Param("password") String password);
}
