package com.oubl23.demo.db.Mapper;

import com.oubl23.demo.db.pojo.User;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 这里的@MapperScan就是上面所讲的Mapper扫描器中所需要的配置，会自动生成代理对象。
 * 注意，接口中的方法名称要和对应的MyBatis映射文件中的语句的id值一样，因为生成的
 * 动态代理，会根据这个匹配相应的Sql语句执行。另外就是方法的参数和返回值也需要注
 * 意。接口中的方法如何定义，对应的MyBatis映射文件就应该进行相应的定义。
 * 最后，标注中的userDao是用来作为Spring的Bean的id(或name)进行使用的，方便我
 * 们在Service层进行注入使用。
 */

@MapperScan
public interface UserMapper {
    //此处的方法名必须和mapper中的映射文件中的id同名
        //回去映射文件中通过com.hua.saf.Mapper.UserMapper.getUser,即this.getClass().getName()+".getUser"
        public User getUser(Long id);
}