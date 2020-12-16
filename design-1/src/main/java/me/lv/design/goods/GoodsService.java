package me.lv.design.goods;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lv
 */
@Slf4j
public class GoodsService {

    public void deliverGoods(String uId, String commodityId) {
        log.info("发放商品: {}, {}", uId, commodityId);
    }
}
