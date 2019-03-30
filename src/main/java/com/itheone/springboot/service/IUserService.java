package com.itheone.springboot.service;
/**
 * @author caohaifengx@163.com 2019-03-12 14:37
 */

public interface IUserService {
    boolean login(String username,String passwd);
    boolean register(String username,String passwd);
    void batchAdd(String username,String passwd);
}