package com.example.demo.domain.controller.validationTest;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@Slf4j
@RestController
public class ValidationTestController {


    @PostMapping("/validation")
    public String validateTest(@Valid @RequestBody(required = true) ComputerInfo info, BindingResult bindingResult){
        log.warn("json" + JSON.toJSONString(info));
        if (bindingResult.hasErrors()){

            log.warn(bindingResult.toString());
            return "error";
        }

        System.out.println(info.getVersion());
        log.info("ok");
        return "OK";
    }
}
