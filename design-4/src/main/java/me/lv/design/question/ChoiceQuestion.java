package me.lv.design.question;

import lombok.Data;

import java.util.Map;

/**
 * 单选题
 * @author lv
 */
@Data
public class ChoiceQuestion {

    private String name;
    private Map<String, String> option;
    private String key;

    public ChoiceQuestion() {
    }

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }
}
