package com.gyz;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class DubboSentinelApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(DubboSentinelApplication.class);
    }

}
