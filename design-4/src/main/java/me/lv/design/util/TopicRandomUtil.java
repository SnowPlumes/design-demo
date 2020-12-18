package me.lv.design.util;

import com.google.common.collect.Maps;

import java.util.*;

/**
 * @author lv
 * @date 2020/12/17 16:43
 */
public class TopicRandomUtil {

    /**
     * 乱序Map元素，记录对应答案key
     *
     * @param option 题目
     * @param key 答案
     * @return
     */
    public static Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        List<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        int index = 0;
        Map<String, String> newOption = Maps.newHashMapWithExpectedSize(option.size());
        String newKey = "";
        for (String next : keySet) {
            String randomKey = keyList.get(index++);
            if (Objects.equals(key, next)) {
                newKey = randomKey;
            }
            newOption.put(randomKey, option.get(next));
        }
        return new Topic(newOption, newKey);
    }
}
