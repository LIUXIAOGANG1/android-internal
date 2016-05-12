package com.web.services.android.persistences.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.web.services.android.beans.WaterData;
import com.web.services.android.persistences.WaterDataPersistence;
import com.web.services.android.repositories.WaterDataRepository;

@Service
public class WaterDataPersistenceImpl implements WaterDataPersistence {
	private static final Logger logger = LoggerFactory.getLogger(WaterDataPersistenceImpl.class);
	
	@Resource
	private WaterDataRepository waterDataRepository;

	@Override
	public WaterData findone(int id) {
		logger.info("[WaterDataPersistenceImpl] findOne 传入参数 id : {}", id);
		WaterData result = waterDataRepository.findOne(id);
		logger.info("[WaterDataPersistenceImpl] findOne 传入参数 id : {}, 查询结果WaterData为: {}", id, result.toString());
		
		return result;
	}

	@Override
	public List<WaterData> findByWaterSiteId(int waterSiteId) {
		logger.info("[WaterDataPersistenceImpl] findByWaterSiteId 传入参数 waterSiteId : {}", waterSiteId);
		List<WaterData> lists = waterDataRepository.findByWaterSiteId(waterSiteId);
		logger.info("[WaterDataPersistenceImpl] findByWaterSiteId 传入参数 waterSiteId : {}, 查询结果List<WaterData>为: {}", waterSiteId, lists);
		
		return lists;
	}

	@Override
	public List<WaterData> findBySiteIdAndTime(int siteId, Date start, Date end, Pageable pageable) {
		logger.info("[WaterDataPersistenceImpl] findByWaterSiteId 传入参数 siteId : {}, start: {}, end: {}", siteId, start, end);
		Page<WaterData> result = waterDataRepository.findBySiteIdAndTime(siteId, start, end, pageable);
		List<WaterData> list = result.getContent();
		logger.info("[WaataPersistenceImpl] findByWaterSiteId 传入参数 siteId : {}, start: {}, end: {}, 查询结果List<WaterData>为: {}", siteId, start, end, list);
		
		return list;
	}
}
