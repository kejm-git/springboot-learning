package com.study;

import com.study.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    //日志记录器
    Logger logger=LoggerFactory.getLogger(getClass());

    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void test1(){
        logger.trace("trace日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志");

    }
}
