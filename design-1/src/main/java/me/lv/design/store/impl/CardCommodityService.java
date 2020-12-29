package me.lv.design.store.impl;

import me.lv.design.card.CardService;
import me.lv.design.store.ICommodity;

import java.util.Map;

/**
 * @author lv
 */
public class CardCommodityService implements ICommodity {

    private final CardService cardService = new CardService();

    @Override
    public void sendCommodity(String uId, String commodityId) throws Exception {
        cardService.grantCard(getBindMobile(uId), commodityId);
    }

    private String getBindMobile(String uId) {
        return "13588888888";
    }
}
