package com.odilon.livepolls.service;
import com.odilon.livepolls.dto.UserDTO;
import com.odilon.livepolls.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);

    void updateName(Integer id, UserDTO userDTO);
}
