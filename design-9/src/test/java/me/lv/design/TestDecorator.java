package me.lv.design;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/**
 * @author plume
 */
public class TestDecorator {

    @Test
    public void test() throws Exception {
        /*// 创建原始的数据源:
        InputStream fis = new FileInputStream("test.gz");
        // 增加缓冲功能:
        InputStream bis = new BufferedInputStream(fis);
        // 增加解压缩功能:
        InputStream gis = new GZIPInputStream(bis);*/

        Component c1 = new ConcreteComponent();
        c1.operation();
        System.out.println("------------------------------------------------");
        Decorator decoratorA = new ConcreteDecoratorA(c1);
        decoratorA.operation();

    }
}
