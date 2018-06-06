package service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 15:29
 * @Description :
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext-provider.xml"});
        context.start();

        System.in.read();
    }
}
