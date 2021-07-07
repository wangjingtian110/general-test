package com.example.demo.domain.controller.validationTest;

import jdk.nashorn.internal.objects.annotations.Property;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;

import javax.annotation.security.PermitAll;
import javax.validation.constraints.Pattern;

/**
 * 任意字符 64个 -
 * 域名规则  1-128 -
 * IP规则 -
 * 数字 0-65535 -
 * 字母，数字 1-64
 * 字母，数字，中文，_，- 1-64
 * 符合 VXX.XX.XX格式
 * 电话号码
 * 邮箱
 * 特殊符号  !@#$%^&*()+_
 * 密码
 */

@Data
@Accessors(chain = true)
public class ComputerInfo {

    //数字
    @Pattern(regexp = "^[0-9]{1,64}$")
    private String id;
    //中文
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{0,}$")
    private String name;
    //中文 英文 特殊字符
    @Pattern(regexp = "^([\\u4e00-\\u9fa5]|!@#\\$%\\^&\\*\\(\\)\\+_)*$")
    private String remark;
    //电话号码
    @Pattern(regexp = "^[0-9]{11}$")
    private String phone;

    @Pattern(regexp = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$")
    private String email;

    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$")
    private String password;

    @Pattern(regexp = "((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}")
    private String ip;

    @Pattern(regexp = "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+\\.?")
    private String url;

    @Pattern(regexp = "[a-zA-z]+://[^\\s]* 或 ^http://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$")
    private String internalUrl;

    @Pattern(regexp = "^[V|v]?\\d{1,2}(\\.\\d{1,2}){1,2}$")
    private String version;

    @Pattern(regexp = "^[0-9]{1,3}$")
    private String testId;


}
