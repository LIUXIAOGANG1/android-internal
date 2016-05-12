package com.web.services.android.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.web.services.android.beans.WaterData;
import com.web.services.android.beans.WaterSite;
import com.web.services.android.persistences.WaterDataPersistence;
import com.web.services.android.persistences.WaterSitePersistence;
import com.web.services.android.service.WaterService;
import com.web.services.android.utils.ConvertString2Date;

@Service
public class WaterServiceImpl implements WaterService {
	private static final Logger logger = LoggerFactory.getLogger(WaterServiceImpl.class);

	@Resource
	private WaterDataPersistence waterDataPersistence;
	
	@Resource
	private WaterSitePersistence waterSitePersistence;

	@Override
	public List<String> findAllSit() {
		logger.info("[WaterServiceImpl] 调用 findAllSit()方法");
		List<String> sites = waterSitePersistence.findAllSit();
		logger.info("[WaterServiceImpl] findAllSit 查询结果List<String>为: {}", sites);
		
		return sites;
	}

	@Override
	public List<WaterData> findByQuery(String site, String startTime, String endTime, int page) {
		int pageSize = 10;
		logger.info("[WaterServiceImpl] 调用 findByQuery() 传入参数site: {}, startTime: {}, endTime: {}, page: {}", site, startTime, endTime, page);
		
		if(StringUtils.isBlank(site) || StringUtils.isBlank(startTime) || StringUtils.isBlank(endTime) || page < 0){
			logger.info("[WaterServiceImpl] 调用 findByQuery() 传入参数site: {}, startTime: {}, endTime: {}, page: {} 不符合规则，返回 null。", site, startTime, endTime, page);
			return null;
		}
		
		WaterSite waterSite = waterSitePersistence.findBySite(site);
		if(waterSite == null){
			logger.info("[WaterServiceImpl] 调用 findByQuery() 传入参数site: {} 没有对应的 WaterSite 存在，返回null。", site);
			return null;
		}
		
		Date start = ConvertString2Date.string2Date(startTime);
		Date end = ConvertString2Date.string2Date(endTime);
		Pageable pageable = new PageRequest(page, pageSize, Direction.ASC, "id");
		
		List<WaterData> list = waterDataPersistence.findBySiteIdAndTime(waterSite.getId(), start, end, pageable);
		logger.info("[WaterServiceImpl] 调用 findByQuery() 传入参数site: {}, startTime: {}, endTime: {}, page: {}, 查询结果为List<WaterData> : {}", site, startTime, endTime, page, list);
		
		return list;
	}
}
