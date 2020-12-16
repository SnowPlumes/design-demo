package me.lv.design.card;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lv
 */
@Slf4j
public class CardService {
    public void grantCard(String bindMobile, String cardId) {
        log.info("发放会员卡一张: {}, {}", bindMobile, cardId);
    }
}
