package com.ding.feign.impl;

import com.ding.entity.Student;
import com.ding.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
