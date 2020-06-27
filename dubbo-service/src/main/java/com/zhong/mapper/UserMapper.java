package com.zhong.mapper;

import com.zhong.api.Do.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from t_user limit 1")
    UserDo getUser(@Param("id") String id);
}
