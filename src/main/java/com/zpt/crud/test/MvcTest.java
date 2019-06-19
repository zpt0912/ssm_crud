package com.zpt.crud.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherervlet-servlet.xml"})
public class MvcTest {

	@Autowired
	WebApplicationContext context;
	/** 虚拟mvc请求，获取到处理结果*/
	MockMvc mockMvc;
	
	@Before
	public void initMokcMvc() {
		mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	public void testPage() throws Exception{
		//模拟请求并拿到返回值
		mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn", "1")).andReturn();
	}
}
