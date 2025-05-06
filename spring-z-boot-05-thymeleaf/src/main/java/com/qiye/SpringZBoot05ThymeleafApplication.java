package com.qiye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.qiye.mapper"})
@SpringBootApplication
public class SpringZBoot05ThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringZBoot05ThymeleafApplication.class, args);
    }

}
