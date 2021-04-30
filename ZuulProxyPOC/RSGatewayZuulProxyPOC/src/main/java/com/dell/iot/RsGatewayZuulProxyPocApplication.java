package com.dell.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.dell.iot.gateway.filter.DemoFilter;

@EnableZuulProxy
@SpringBootApplication
public class RsGatewayZuulProxyPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsGatewayZuulProxyPocApplication.class, args);
	}

	@Bean
	public DemoFilter demoFilter() {
	    return new DemoFilter();
	}
	/*
	 * @Bean public DemoFilter1 demoFilter1() { return new DemoFilter1(); }
	 */
}
