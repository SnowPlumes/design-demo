package me.lv.design.builder;

import me.lv.design.ceiling.LevelOneCeiling;
import me.lv.design.ceiling.LevelTwoCeiling;
import me.lv.design.coat.DuluxCoat;
import me.lv.design.coat.LiBangCoat;
import me.lv.design.floor.DerFloor;
import me.lv.design.floor.ShengXiangFloor;
import me.lv.design.tile.DongPengTile;
import me.lv.design.tile.MarcoPoloTile;

import java.math.BigDecimal;

/**
 * @author lv
 */
public class Builder {
    public IMenu levelOne(BigDecimal area) {
        return new DecorationPackageMenu(area, "level-one")
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new DerFloor())
                .appendFloor(new DongPengTile());
    }

    public IMenu levelTwo(BigDecimal area) {
        return new DecorationPackageMenu(area, "level-two")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendFloor(new ShengXiangFloor())
                .appendTile(new MarcoPoloTile());
    }
}
