package com.web.services.android.persistences.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.web.services.android.beans.WaterSite;
import com.web.services.android.persistences.WaterSitePersistence;
import com.web.services.android.repositories.WaterSiteRepository;

@Service
public class WaterSitePersistenceImpl implements WaterSitePersistence {
	private static final Logger logger = LoggerFactory.getLogger(WaterSitePersistenceImpl.class);

	@Resource
	private WaterSiteRepository waterSiteRepository;
	
	@Override
	public WaterSite findOne(int id) {
		logger.info("[WaterSitePersistenceImpl] findOne 传入参数 id : {}", id);
		WaterSite result = waterSiteRepository.findOne(id);
		logger.info("[WaterSitePersistenceImpl] findOne 传入参数 id : {}, 查询结果WaterSite为: {}", id, result.toString());
		
		return result;
	}
	
	@Override
	public WaterSite findBySite(String site) {
		logger.info("[WaterSitePersistenceImpl] findBySite 传入参数 site : {}", site);
		WaterSite result = waterSiteRepository.findBySite(site);
		logger.info("[WaterSitePersistenceImpl] findBySite 传入参数 site : {}, 查询结果WaterSite为: {}", site, result.toString());
		
		return result;
	}

	@Override
	public List<WaterSite> findAll() {
		logger.info("[WaterSitePersistenceImpl] 调用 findAll()方法");
		List<WaterSite> list = (List<WaterSite>)waterSiteRepository.findAll();
		logger.info("[WaterSitePersistenceImpl] findAll 查询结果List<WaterSite>为: {}", list);
		
		return list;
	}

	@Override
	public List<String> findAllSit() {
		logger.info("[WaterSitePersistenceImpl] 调用 findAllSit()方法");
		List<String> sites = waterSiteRepository.findAllSit();
		logger.info("[WaterSitePersistenceImpl] findAllSit 查询结果List<String>为: {}", sites);
		return sites;
	}
}
