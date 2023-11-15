package com.study.elasticsearch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.study.elasticsearch.repository")
public class JPAConfig {
}

