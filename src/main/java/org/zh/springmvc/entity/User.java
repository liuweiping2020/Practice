package org.zh.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zenghang on 2018/4/9.
 */
@Entity
@Table(name = "T_USER")
public class User {
    @Id
    @Column(name = "U_ID")
    private Long id;
    @Column(name = "U_USERNAME")
    private String name;
    @Column(name = "U_PASSWORD")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
