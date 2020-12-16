package me.lv.design.store;

import me.lv.design.store.impl.CardCommodityService;
import me.lv.design.store.impl.GoodsCommodityService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lv
 */
public class StoreFactory {

    private static final Map<Commodity, Class<? extends ICommodity>> SERVICE = new HashMap<>();

    static {
        SERVICE.put(Commodity.CARD, CardCommodityService.class);
        SERVICE.put(Commodity.GOODS, GoodsCommodityService.class);
    }

    public enum Commodity {
        /**
         *
         */
        CARD,
        GOODS;
    }

    public ICommodity getCommodityService(Commodity commodity) {
        Class<? extends ICommodity> commodityService = SERVICE.get(commodity);
        if (commodityService == null) {
            return null;
        }
        try {
            return commodityService.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
