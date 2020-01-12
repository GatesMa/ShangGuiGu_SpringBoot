package com.gatesma.springboot;

import com.gatesma.springboot.bean.Person;

import com.gatesma.springboot.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;


/**
 * SpringBoot单元测试;
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入到容器的功能
 *
 */
@Component
@SpringBootTest
class SpringBoot02ConfigApplicationTests {
	
	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testHelloService() {
		boolean containsBean = ioc.containsBean("helloService");
		System.out.println(containsBean);
	}

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
