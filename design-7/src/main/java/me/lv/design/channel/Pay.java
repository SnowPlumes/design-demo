package me.lv.design.channel;

import me.lv.design.mode.IPayMode;

import java.math.BigDecimal;

/**
 * @author lv
 * @date 2020/12/22 14:46
 */
public abstract class Pay {

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 支付
     *
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
