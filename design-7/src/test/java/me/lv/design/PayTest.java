package me.lv.design;

import lombok.extern.slf4j.Slf4j;
import me.lv.design.channel.AliPay;
import me.lv.design.channel.Pay;
import me.lv.design.channel.WxPay;
import me.lv.design.mode.CypherPay;
import me.lv.design.mode.FingerprintPay;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author lv
 * @date 2020/12/22 16:09
 */
@Slf4j
public class PayTest {

    @Test
    public void testPay() {
        log.info("\r\n模拟测试场景；微信支付、密码方式。");
        Pay wxPay = new WxPay(new CypherPay());
        wxPay.transfer("weixin_0000001", "100000109893", new BigDecimal(100));

        log.info("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new AliPay(new FingerprintPay());
        zfbPay.transfer("ali_0000001","100000109894",new BigDecimal(100));

    }
}
