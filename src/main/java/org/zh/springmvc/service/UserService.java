package org.zh.springmvc.service;

import org.zh.springmvc.entity.User;

import java.util.List;

/**
 * Created by zenghang on 2018/4/9.
 */
public interface UserService {
    List<User> findAll();
}
