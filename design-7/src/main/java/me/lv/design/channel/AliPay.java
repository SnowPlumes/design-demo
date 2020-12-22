package me.lv.design.channel;

import lombok.extern.slf4j.Slf4j;
import me.lv.design.mode.IPayMode;

import java.math.BigDecimal;

/**
 * @author lv
 * @date 2020/12/22 14:47
 */
@Slf4j
public class AliPay extends Pay{

    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        log.info("alipay 开始 uid : {}, tradeId : {}, amount : {}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        log.info("alipay 支付校验 uid : {}, tradeId : {}, security : {}", uId, tradeId, security);
        return "success";
    }
}
