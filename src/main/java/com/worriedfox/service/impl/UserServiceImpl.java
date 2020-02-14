package com.worriedfox.service.impl;

import com.worriedfox.dao.UserDao;
import com.worriedfox.domain.User;
import com.worriedfox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser() {
        return userDao.getUser();
    }
}
