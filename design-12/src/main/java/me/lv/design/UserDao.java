package me.lv.design;

/**
 * @author plume
 * @date 2020/12/30 23:09
 */
public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("保存数据...");
    }
}
