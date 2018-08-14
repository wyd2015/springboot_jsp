package com.ethan.jsp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;






/**
 * @ControllerAdvice是Controller的辅助类，在此作为全局异常处理的切面类。异常出现时发送邮件也是在此处实现。
 * @ControllerAdvice可以指定扫描范围(basePackage="com.ethan.jsp.controller")
 * @ControllerAdvice约定的几种回方式：
 *      1. 返回String类型，表示跳到某个view；
 *      2. 返回ModelAndView
 *      3. 返回Model+@ResponseBody
 */
//@ControllerAdvice
//@ResponseBody
@RestControllerAdvice(basePackages = {"com.ethan.jsp.controller"}) //必需  相当于 @ControllerAdvice + @ResponseBody，用于以json形式返回捕获到的异常
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)//必需 用于设定捕获的异常类型
    public Map<String, Object> exceptionHandler(){

        Map<String, Object> map = new HashMap<>();
        map.put("status", 104);
        map.put("message", "系统异常！");

        return map;
    }

}
