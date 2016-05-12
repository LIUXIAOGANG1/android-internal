package com.web.services.android.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.services.android.beans.SmokeData;
import com.web.services.android.beans.SmokeSite;
import com.web.services.android.service.SmokeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class SmokeServiceImplTest {
	
	@Resource
	private SmokeService smokeService;
	
	@Test
	public void getAllFactory(){
		List<String> list = smokeService.getAllFactory();
		
		for(String value : list){
			System.out.println(value);
		}
	}
	
	@Test
	public void getPollutionByFactory(){
		List<String> list = smokeService.getPollutionByFactory("耐火公司");
		
		for(String value : list){
			System.out.println(value);
		}
	}
	
	@Test
	public void findByFactoryAndPollution(){
		SmokeSite smokeSite = smokeService.findByFactoryAndPollution("耐火公司", "1#活性出口");
		
		System.out.println(smokeSite.toString());
	}
	
	@Test
	public void findByQuery(){
		List<SmokeData> list = smokeService.findByQuery("耐火公司", "1#活性出口", "1990-11-02 00:00:00", "2016-11-02 00:00:00", 0);
		
		for(SmokeData value : list){
			System.out.println(value.toString());
		}
	}
}
