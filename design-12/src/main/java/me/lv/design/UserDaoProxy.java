package me.lv.design;

/**
 * @author plume
 * @date 2020/12/30 23:10
 */
public class UserDaoProxy implements IUserDao{

    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("开始事务...");
        userDao.save();
        System.out.println("提交事务...");
    }
}
