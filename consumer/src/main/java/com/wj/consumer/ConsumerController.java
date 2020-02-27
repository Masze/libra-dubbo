package com.wj.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wj.api.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ConsumerController {

	@Reference
	private ApiService apiService;

	@GetMapping("/orderToMember")
	public String orderToMember() {

		String param = apiService.doSomeThing("123");

		System.out.println("consumer  param:" + param);

		return param;
	}
}