package me.lv.app;

import me.lv.dao.UserDao;
import me.lv.handler.LogHandler;
import me.lv.interceptor.LogInterceptor;
import me.lv.service.UserService;
import me.lv.service.impl.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @author plume
 * @date 2021/6/2 14:58
 */
public class App {
    public static void main(String[] args) {
        /*UserService userService = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(), new Class[]{UserService.class}, new LogHandler(new UserServiceImpl()));
        userService.users();*/
        LogInterceptor logInterceptor = new LogInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDao.class);
        enhancer.setCallback(logInterceptor);

        UserDao userDao = (UserDao) enhancer.create();
        userDao.users();
    }

}
