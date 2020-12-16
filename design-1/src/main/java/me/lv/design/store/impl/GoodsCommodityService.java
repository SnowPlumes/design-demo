package me.lv.design.store.impl;

import me.lv.design.goods.GoodsService;
import me.lv.design.store.ICommodity;

import java.util.Map;

/**
 * @author lv
 */
public class GoodsCommodityService implements ICommodity {

    private final GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        goodsService.deliverGoods(uId, commodityId);
    }
}
