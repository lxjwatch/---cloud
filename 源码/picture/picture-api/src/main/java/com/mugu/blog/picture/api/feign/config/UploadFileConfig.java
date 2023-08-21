package com.mugu.blog.picture.api.feign.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;

public class UploadFileConfig {
    /**
     * 适配表单提交，用于文件上传
     */
    @Bean
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder();
    }
}
