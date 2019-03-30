package com.itheone.springboot.dao;

import com.itheone.springboot.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository //for删除UsersMapper usersMapper报错提示
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users findByUsernameAndPasswd(@Param("username") String username, @Param("passwd") String passwd);
}