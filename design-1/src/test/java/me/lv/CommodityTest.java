package me.lv;

import me.lv.design.store.ICommodity;
import me.lv.design.store.StoreFactory;
import org.junit.Test;

import java.util.UUID;

public class CommodityTest {

    @Test
    public void testCommodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        String uid = UUID.randomUUID().toString();

        ICommodity cardService = storeFactory.getCommodityService(StoreFactory.Commodity.CARD);
        cardService.sendCommodity(uid, UUID.randomUUID().toString());

        ICommodity goodsService = storeFactory.getCommodityService(StoreFactory.Commodity.GOODS);
        goodsService.sendCommodity(uid, UUID.randomUUID().toString());
    }
}
