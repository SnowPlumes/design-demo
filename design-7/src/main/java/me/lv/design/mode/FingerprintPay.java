package me.lv.design.mode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lv
 * @date 2020/12/22 14:52
 */
@Slf4j
public class FingerprintPay implements IPayMode{
    @Override
    public boolean security(String uId) {
        log.info("指纹支付验证... uId : {}", uId);
        return true;
    }
}
