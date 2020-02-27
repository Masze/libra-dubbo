package com.wj.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.api.ApiService;
import org.springframework.stereotype.Component;

@Component
@Service
public class ApiServiceImpl implements ApiService {

	@Override
	public String doSomeThing(String param) {
		System.out.println("provider param ： " + param);
		return param;
	}
}
