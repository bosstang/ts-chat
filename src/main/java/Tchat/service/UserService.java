package Tchat.service;

import Tchat.domain.User;

public interface UserService {

    boolean queryUserNameIsExist(String username);
      User login(User user);
    User  register(User user);

}
