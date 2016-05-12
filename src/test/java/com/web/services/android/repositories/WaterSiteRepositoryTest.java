package com.web.services.android.repositories;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.services.android.beans.WaterSite;
import com.web.services.android.repositories.WaterSiteRepository;
import com.web.services.android.utils.JsonTools;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class WaterSiteRepositoryTest {
	
	@Resource
	private WaterSiteRepository waterSiteRepository;
	
	@Test
	public void findOne(){
		WaterSite result = waterSiteRepository.findOne(1);
		String msg = JsonTools.createJsonString("WaterSite", result);
		System.out.println(msg);
	}
	
	@Test
	public void findAll(){
		List<WaterSite> results = (List<WaterSite>)waterSiteRepository.findAll();
		String msg = JsonTools.createJsonString("WaterSites", results);
		System.out.println(msg);
	}
	
	@Test
	public void findBySite(){
		WaterSite result = waterSiteRepository.findBySite("焦化外排");
		String msg = JsonTools.createJsonString("WaterSite", result);
		System.out.println(msg);
	}
	
	@Test
	public void findAllSit(){
		List<String> sites = waterSiteRepository.findAllSit();
		String msg = JsonTools.createJsonString("sites", sites);
		System.out.println(msg);
	}
}
