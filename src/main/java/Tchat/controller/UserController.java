package Tchat.controller;
import Tchat.domain.User;
import Tchat.domain.UserVo;
import Tchat.service.UserService;
import Tchat.util.JSONResult;
import Tchat.util.MD5Utils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

@Autowired
UserService userService;

    @RequestMapping(value = "/registOrLogin")
    @ResponseBody
    public JSONResult registOrLogin(@RequestBody User user) throws Exception {
        System.out.println("进入登录注册页面");

        if (StringUtils.isBlank(user.getUsername())||
                StringUtils.isBlank(user.getPassword()))
        {
                    return JSONResult.errorMsg("用户名或者密码不能为空");
                             }
        User result=null;
  boolean isExist= userService.queryUserNameIsExist(user.getUsername());
        if(isExist){
            System.out.println("登录");
            user.setPassword(MD5Utils.getMD5Str(user.getPassword()));
          result = userService.login(user);
           if(result==null){
               return JSONResult.errorMsg("用户名或者密码错误");
           }else{
               return  JSONResult.ok(result);
           }

        }else {
            System.out.println("注册");
            user.setNickname(user.getUsername());
             user.setFaceImgBig("");
             user.setFaceImg("");
             user.setPassword(MD5Utils.getMD5Str(user.getPassword()));
            result= userService.register(user);
        }
        UserVo userVo=new UserVo() ;
        BeanUtils.copyProperties(result, userVo);
        return  JSONResult.ok(userVo);
    }
}
