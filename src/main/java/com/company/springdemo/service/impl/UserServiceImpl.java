package com.company.springdemo.service.impl;

import com.company.springdemo.controller.DemoController;
import com.company.springdemo.dao.UserDao;
import com.company.springdemo.model.UserDomain;
import com.company.springdemo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.util.List;
import java.util.Random;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(UserDomain user) {
        return userDao.insert(user);
    }

    @Override
    public boolean deleteById(int userId) {
        return userDao.deleteById(userId);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        Random rand = new Random();
        try {
            int time = rand.nextInt(5000);
            logger.info("查询2休息" + time + "毫秒！");


            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<UserDomain> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

}
