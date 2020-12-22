package me.lv.design.mode;

/**
 * @author lv
 * @date 2020/12/22 14:46
 */
public interface IPayMode {

    /**
     * 验证
     *
     * @param uId
     * @return
     */
    boolean security(String uId);
}
