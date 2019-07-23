package com.ding.feign;

import com.ding.entity.Student;
import com.ding.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value="provider",fallback=FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();
    @GetMapping("/student/index")
    String index();
}
