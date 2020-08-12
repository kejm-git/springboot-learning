package com.study;

import com.study.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author 60008130
 * Date 2020/8/12 11:22
 **/

@SpringBootTest
public class MyTest {

    @Autowired
    private Person person;

    @Test
    void test1(){
        System.out.println(person);
    }
}
