package com.web.services.android.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.services.android.beans.WaterData;
import com.web.services.android.service.WaterService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class WaterServiceImplTest {
	@Resource
	private WaterService waterService;
	
	@Test
	public void getAllFactory(){
		List<String> list = waterService.findAllSit();
		
		for(String value : list){
			System.out.println(value);
		}
	}
	
	@Test
	public void findByQuery(){
		List<WaterData> list = waterService.findByQuery("工业港污水处理进口", "1990-11-02 00:00:00", "2016-11-02 00:00:00", 0);
		
		for(WaterData value : list){
			System.out.println(value.toString());
		}
	}
}
