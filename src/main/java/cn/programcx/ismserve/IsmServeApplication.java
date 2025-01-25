package cn.programcx.ismserve;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.programcx.ismserve.mapper")
public class IsmServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(IsmServeApplication.class, args);
    }

}
