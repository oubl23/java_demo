package com.oubl23.demo.mapper;

import com.oubl23.demo.pojo.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserMapper {
    //此处的方法名必须和mapper中的映射文件中的id同名
    //回去映射文件中通过com.hua.saf.Mapper.UserMapper.getUser,即this.getClass().getName()+".getUser"
    public User getUser(Long id);
}
