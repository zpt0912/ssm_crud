package com.zpt.crud.test;

import static org.hamcrest.CoreMatchers.nullValue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zpt.crud.bean.Deptment;
import com.zpt.crud.dao.DeptmentMapper;

/**
 * 测试dao层的工作
 * @author zpt
 *spring的单元测试
 *1.导入SpringTest模块
 *2.使用@ContextConfiguration注解指定Spring配置文件的位置
 *3.直接用autowired注解
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DeptmentMapper deptmentMapper;
	
	/**
	 * 测试部门mapper
	 */
	@Test
	public void testCURD() {
		
		System.out.println(deptmentMapper);
		Deptment dept=new Deptment(null, "嘻哈部");
		deptmentMapper.insert(dept);
		
	}
	
}
