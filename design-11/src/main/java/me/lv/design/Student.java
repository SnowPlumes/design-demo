package me.lv.design;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author plume
 */
@Slf4j
public class Student {

    private static final Map<String, Student> CACHE = new HashMap<>();

    public static Student create(int id, String name) {
        String key = id + "\n" + name;
        // 先查找缓存:
        Student std = CACHE.get(key);
        if (std == null) {
            // 未找到,创建新对象:
            log.info("create new Student({}, {})", id, name);
            std = new Student(id, name);
            // 放入缓存:
            CACHE.put(key, std);
        } else {
            // 缓存中存在:
            log.info("return cached Student({}, {})", std.id, std.name);
        }
        return std;
    }

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
