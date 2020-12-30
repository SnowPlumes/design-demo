package me.lv.design;

import org.junit.Test;

/**
 * @author plume
 */
public class ProxyTest {

    @Test
    public void test() {
        IUserDao userDao = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();
    }
}
