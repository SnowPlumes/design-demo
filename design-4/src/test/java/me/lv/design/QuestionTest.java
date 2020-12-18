package me.lv.design;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author lv
 * @date 2020/12/18 9:47
 */
@Slf4j
public class QuestionTest {

    @Test
    public void testQuestion() throws CloneNotSupportedException {
        QuestionBankController controller = new QuestionBankController();
        log.info("paper : {}", controller.creatPaper("张三", "20201218001"));
        log.info("paper : {}", controller.creatPaper("李四", "20201218002"));
    }
}
