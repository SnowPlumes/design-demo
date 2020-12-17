package me.lv.design;

import lombok.extern.slf4j.Slf4j;
import me.lv.design.builder.Builder;
import org.junit.Test;

import java.math.BigDecimal;

@Slf4j
public class BuilderTest {

    @Test
    public void testBuilder() {
        Builder builder = new Builder();
        log.info("level-one : {}", builder.levelOne(new BigDecimal("98.95")).detail());
        log.info("level-two : {}", builder.levelTwo(new BigDecimal("120.56")).detail());
    }
}
