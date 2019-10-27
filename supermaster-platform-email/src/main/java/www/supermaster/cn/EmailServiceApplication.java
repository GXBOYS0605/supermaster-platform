package www.supermaster.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * All rights Reserved, Designed By www.super-master.cn
 *
 * @ProjectName supermaster-platform
 * @Package www.supermaster.cn
 * @ClassName EmailServiceApplication
 * @Description
 * @Author [Lance Ting]
 * @Date 2019/10/27 3:46
 * @Version V1.0
 * @Copyright: 2019 www.super-master.cn Inc. All rights reserved.
 * @see 注意：本文件Lance Ting所作,如果转载或使用请标明具体出处!
 **/
@SpringBootApplication
@EnableEurekaClient
public class EmailServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailServiceApplication.class);
    }
}