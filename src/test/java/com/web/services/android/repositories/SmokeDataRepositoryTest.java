package com.web.services.android.repositories;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.services.android.beans.SmokeData;
import com.web.services.android.repositories.SmokeDataRepository;
import com.web.services.android.utils.JsonTools;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class SmokeDataRepositoryTest {
	
	@Resource
	private SmokeDataRepository smokeDataRepository;
	
	@Test
	public void findBySmokeSiteId(){
		List<SmokeData> smokeDatas = smokeDataRepository.findBySmokeSiteId("0103");
		String msg = JsonTools.createJsonString("WaterDatas", smokeDatas);
		System.out.println(msg);
	}
	
	@Test
	public void findBySiteIdAndTime() throws ParseException{
		Pageable pageable = new PageRequest(0, 10, Direction.ASC, "id");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date start = format.parse("2003-01-06 00:00:00");
		Date end = format.parse("2003-11-04 00:00:00");
		List<SmokeData> smokeDatas = smokeDataRepository.findBySiteIdAndTime("0103", start, end, pageable);
		String msg = JsonTools.createJsonString("SmokeData", smokeDatas);
		System.out.println(msg);
	}
}
