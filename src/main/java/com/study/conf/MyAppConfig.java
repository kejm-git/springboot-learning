package com.study.conf;

import com.study.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyAppConfig
 * @Description TODO
 * @Author 60008130
 * Date 2020/8/12 9:59
 *
 * @Configuration 指明当前类是一个配置类，就是来替代之前的<bean></bean>配置文件
 **/
@Configuration
public class MyAppConfig {

    /**
     * @return
     * 容器中的id默认就是方法名
     */
    @Bean
    public HelloService helloService01(){
        System.out.println("配置类@Bean给容器中添加组件");
        return new HelloService();
    }
}
