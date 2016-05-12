package com.web.services.android.repositories;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.services.android.beans.SmokeSite;
import com.web.services.android.repositories.SmokeSiteRepository;
import com.web.services.android.utils.JsonTools;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class SmokeSiteRepositoryTest {

	@Resource
	private SmokeSiteRepository smokeSiteRepository;
	
	@Test
	public void findOne(){
		SmokeSite smokeSite = smokeSiteRepository.findOne("0101");
		String msg = JsonTools.createJsonString("SmokeSite", smokeSite);
		System.out.println(msg);
	}
	
	@Test
	public void getAllFactory(){
		List<String> list = smokeSiteRepository.getAllFactory();
		String msg = JsonTools.createJsonString("list", list);
		System.out.println(msg);
	}
	
	@Test
	public void getPollutionByFactory(){
		List<String> list = smokeSiteRepository.getPollutionByFactory("耐火公司");
		String msg = JsonTools.createJsonString("list", list);
		
		System.out.println(msg);
	}
	
	@Test
	public void findByFactoryAndPollution(){
		SmokeSite smokeSite = smokeSiteRepository.findByFactoryAndPollution("耐火公司", "100m2回转窑出口");
		String msg = JsonTools.createJsonString("SmokeSite", smokeSite);
		
		System.out.println(msg);
	}
}
