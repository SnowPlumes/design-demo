package me.lv.design.mode;

/**
 * @author 1
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
