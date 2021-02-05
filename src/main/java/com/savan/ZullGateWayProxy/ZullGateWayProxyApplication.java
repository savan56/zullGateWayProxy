package com.savan.ZullGateWayProxy;

import com.savan.ZullGateWayProxy.filters.ErrorFilter;
import com.savan.ZullGateWayProxy.filters.PostFilter;
import com.savan.ZullGateWayProxy.filters.PreFilter;
import com.savan.ZullGateWayProxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZullGateWayProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZullGateWayProxyApplication.class, args);
	}

}
