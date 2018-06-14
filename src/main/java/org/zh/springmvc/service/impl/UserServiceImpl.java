package org.zh.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zh.springmvc.entity.User;
import org.zh.springmvc.repository.UserRepository;
import org.zh.springmvc.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zenghang on 2018/4/9.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
