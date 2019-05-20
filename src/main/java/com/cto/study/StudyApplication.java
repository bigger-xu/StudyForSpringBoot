package com.cto.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhangyongwei
 * 排除solr配置
 */
@SpringBootApplication
@MapperScan("com.cto.study.dao")
/**
 * 事务配置
 * @author Evan
 */
@EnableTransactionManagement
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

}
