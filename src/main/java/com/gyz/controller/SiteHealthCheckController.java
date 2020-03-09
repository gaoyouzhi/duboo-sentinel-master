package com.gyz.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName:SiteHealthCheckController
 * @Description:健康检查代码
 * @Author: youzhi.gao
 * @Date: 2019/01/14
 * @Version: 1.0.0
 */
@RestController
@RequestMapping(value = "check")
public class SiteHealthCheckController {


    @RequestMapping(value = "/web", method = RequestMethod.GET)
    public String index() {
        return "success";
    }


}
