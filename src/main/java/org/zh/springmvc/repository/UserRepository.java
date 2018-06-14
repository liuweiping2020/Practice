package org.zh.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zh.springmvc.entity.User;

/**
 * Created by zenghang on 2018/4/9.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
