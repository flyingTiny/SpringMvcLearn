package com.xcy.controller;

import com.xcy.entity.User;
import org.springframework.aop.framework.AopContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuchenyi
 * @Date: 2019-05-04 11:18
 * @Version 1.0
 */
public class UserController extends AbstractController implements LastModified {
    private long lastModified;
    @Override
    protected ModelAndView handleRequestInternal( HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<User> users = new ArrayList<>();
        User userA = new User();
        User userB = new User();
        userA.setUserName("张三");
        userA.setAge(27);
        userB.setUserName("李四");
        userB.setAge(37);
        users.add(userA);
        users.add(userB);
//        RequestContextUtils.getFlashMapManager(httpServletRequest);
        System.out.println("in UserController 1");
//        System.out.println(AopContext.currentProxy());
        return new ModelAndView("userList","users",users);
    }

    @Override
    public long getLastModified(HttpServletRequest request) {
//        if(lastModified == 0l) lastModified = System.currentTimeMillis();
////        return lastModified;
        return System.currentTimeMillis();
    }
}
