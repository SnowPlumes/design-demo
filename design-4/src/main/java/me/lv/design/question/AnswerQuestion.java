package me.lv.design.question;

import lombok.Data;

/**
 * 解答题
 * @author lv
 */
@Data
public class AnswerQuestion {

    private String name;
    private String key;

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }
}
