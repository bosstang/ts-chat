package Tchat.service.impl;

import Tchat.domain.User;
import Tchat.domain.UserExample;
import Tchat.mapper.UserMapper;
import Tchat.service.UserService;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;


@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements UserService {

    @Autowired
  UserMapper userMapper;


    @Override
    public boolean queryUserNameIsExist(String username) {
     User result= userMapper.queryUserNameIsExist(username);
        return result!=null?true:false;
    }

    @Override
    public User login(User user) {
//        Example example=new Example(user.getClass());
//        Example.Criteria criteria=example.createCriteria();
//        criteria.andEqualTo("password",user.getPassword());
//        criteria.andEqualTo("username",user.getUsername());
         User result= userMapper.login(user);
        return result;
    }

    @Override
    public User register(User user) {

        //二维码
        user.setQrcord("");
        user.setId(UUID.randomUUID().toString());

     //userMapper.insert(user);
        return user;
    }
}
