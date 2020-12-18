package me.lv.design.util;

import lombok.Data;

import java.util.Map;

/**
 * @author lv
 */
@Data
public class Topic {
    private Map<String, String> option;
    private String key;

    public Topic(Map<String, String> option, String key) {
        this.option = option;
        this.key = key;
    }
}
