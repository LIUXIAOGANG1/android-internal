package com.web.services.android.persistences.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.web.services.android.beans.SmokeData;
import com.web.services.android.persistences.SmokeDataPersistence;
import com.web.services.android.repositories.SmokeDataRepository;

@Service
public class SmokeDataPersistenceImpl implements SmokeDataPersistence {
	private static final Logger logger = LoggerFactory.getLogger(SmokeDataPersistenceImpl.class);
	
	@Resource
	private SmokeDataRepository smokeDataRepository;

	@Override
	public SmokeData findone(int id) {
		logger.info("[SmokeDataPersistenceImpl] findOne 传入参数 id : {}", id);
		SmokeData result = smokeDataRepository.findOne(id);
		logger.info("[SmokeDataPersistenceImpl] findOne 传入参数 id : {}, 查询结果SmokeData为: {}", id, result.toString());
		
		return result;
	}

	@Override
	public List<SmokeData> findBySmokeSiteId(String smokeSiteId) {
		logger.info("[SmokeDataPersistenceImpl] findBySmokeSiteId 传入参数 smokeSiteId : {}", smokeSiteId);
		List<SmokeData> lists = smokeDataRepository.findBySmokeSiteId(smokeSiteId);
		logger.info("[SmokeDataPersistenceImpl] findBySmokeSiteId 传入参数 smokeSiteId : {}, 查询结果List<SmokeData>为: {}", smokeSiteId, lists);
		
		return lists;
	}

	@Override
	public List<SmokeData> findBySiteIdAndTime(String siteId, Date start, Date end, Pageable pageable) {
		logger.info("[SmokeDataPersistenceImpl] findBySiteIdAndTime 传入参数 siteId : {}, start : {}, end : {}", siteId, start, end);
		List<SmokeData> lists = smokeDataRepository.findBySiteIdAndTime(siteId, start, end, pageable);
		logger.info("[SmokeDataPersistenceImpl] findBySiteIdAndTime 传入参数 siteId : {}, start : {}, end : {}, 查询结果List<SmokeData>为: {}", siteId, start, end, lists);
		
		return lists;
	}

}
