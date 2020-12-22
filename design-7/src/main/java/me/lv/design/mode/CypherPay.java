package me.lv.design.mode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lv
 * @date 2020/12/22 16:07
 */
@Slf4j
public class CypherPay implements IPayMode{
    @Override
    public boolean security(String uId) {
        log.info("密码支付验证... uId : {}", uId);
        return true;
    }
}
