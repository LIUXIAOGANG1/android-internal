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

import com.web.services.android.beans.SmokeData;
import com.web.services.android.beans.SmokeSite;
import com.web.services.android.persistences.SmokeDataPersistence;
import com.web.services.android.persistences.SmokeSitePersistence;
import com.web.services.android.service.SmokeService;
import com.web.services.android.utils.ConvertString2Date;


@Service
public class SmokeServiceImpl implements SmokeService {
	private static final Logger logger = LoggerFactory.getLogger(SmokeServiceImpl.class);
	
	@Resource
	private SmokeDataPersistence smokeDataPersistence;
	
	@Resource
	private SmokeSitePersistence smokeSitePersistence;

	@Override
	public List<String> getAllFactory() {
		logger.info("[SmokeServiceImpl] 调用 getAllFactory()方法");
		List<String> factorys = smokeSitePersistence.getAllFactory();
		logger.info("[SmokeServiceImpl] getAllFactory() 查询结果List<String>为: {}", factorys);
		
		return factorys;
	}

	@Override
	public List<String> getPollutionByFactory(String factoryName) {
		logger.info("[SmokeServiceImpl] 调用 getPollutionByFactory()方法 传入参数factoryName: {}", factoryName);
		List<String> pollutions = smokeSitePersistence.getPollutionByFactory(factoryName);
		logger.info("[SmokeServiceImpl] 调用 getPollutionByFactory()方法 传入参数factoryName: {}, 查询结果为List<String>: {}", factoryName, pollutions);
		return pollutions;
	}

	@Override
	public SmokeSite findByFactoryAndPollution(String factoryName, String pollutionName) {
		logger.info("[SmokeServiceImpl] 调用 findByFactoryAndPollution()方法 传入参数factoryName: {}, pollutionName: {}", factoryName, pollutionName);
		SmokeSite smokeSite = smokeSitePersistence.findByFactoryAndPollution(factoryName, pollutionName);
		logger.info("[SmokeServiceImpl] 调用 findByFactoryAndPollution()方法 传入参数factoryName: {}, pollutionName: {}, 返回结果为SmokeSite : {}", factoryName, pollutionName, smokeSite.toString());
		return smokeSite;
	}

	@Override
	public List<SmokeData> findByQuery(String factory, String pollution, String startTime, String endTime, int page) {
		int pageSize = 10;
		logger.info("[SmokeServiceImpl] 调用 findByQuery() 传入参数factory: {}, pollution: {}, startTime: {}, endTime: {}, page: {}", factory, pollution, startTime, endTime, page);
		
		if(StringUtils.isBlank(factory) || StringUtils.isBlank(pollution) || StringUtils.isBlank(startTime) || StringUtils.isBlank(endTime) || page < 0){
			logger.info("[SmokeServiceImpl] 调用 findByQuery() 传入参数不符合规则，返回 null。");
			return null;
		}
		
		SmokeSite smokeSite = smokeSitePersistence.findByFactoryAndPollution(factory, pollution);
		
		if(smokeSite == null){
			logger.info("[SmokeServiceImpl] 调用 findByQuery() 传入参数factory: {}, pollution: {} 没有对应的 SmokeSite 存在，返回null。", factory, pollution);
			return null;
		}
		
		Date start = ConvertString2Date.string2Date(startTime);
		Date end = ConvertString2Date.string2Date(endTime);
		Pageable pageable = new PageRequest(page, pageSize, Direction.ASC, "id");
		
		List<SmokeData> list = smokeDataPersistence.findBySiteIdAndTime(smokeSite.getId(), start, end, pageable);
		logger.info("[SmokeServiceImpl] 调用 findByQuery() 传入参数factory: {}, pollution: {}, startTime: {}, endTime: {}, page: {}, 查询结果为List<SmokeData> : {}", factory, pollution, startTime, endTime, page, list);
		
		return list;
	}
}
