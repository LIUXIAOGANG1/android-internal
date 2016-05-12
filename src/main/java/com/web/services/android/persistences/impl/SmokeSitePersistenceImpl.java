package com.web.services.android.persistences.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.web.services.android.beans.SmokeSite;
import com.web.services.android.persistences.SmokeSitePersistence;
import com.web.services.android.repositories.SmokeSiteRepository;

@Service
public class SmokeSitePersistenceImpl implements SmokeSitePersistence {
	private static final Logger logger = LoggerFactory.getLogger(SmokeSitePersistenceImpl.class);
	
	@Resource
	private SmokeSiteRepository smokeSiteRepository;
	
	@Override
	public SmokeSite findOne(String id) {
		logger.info("[SmokeSitePersistenceImpl] findOne 传入参数 id : {}", id);
		SmokeSite result = smokeSiteRepository.findOne(id);
		logger.info("[SmokeSitePersistenceImpl] findOne 传入参数 id : {}, 查询结果SmokeSite为: {}", id, result.toString());
		
		return result;
	}

	@Override
	public SmokeSite findByPollutionName(String pollutionName) {
		logger.info("[SmokeSitePersistenceImpl] findByPollutionName 传入参数 pollutionName : {}", pollutionName);
		SmokeSite result = smokeSiteRepository.findByPollutionName(pollutionName);
		logger.info("[SmokeSitePersistenceImpl] findOne 传入参数 pollutionName : {}, 查询结果SmokeSite为: {}", pollutionName, result.toString());
		
		return result;
	}

	@Override
	public List<SmokeSite> findAll() {
		logger.info("[SmokeSitePersistenceImpl] 调用方法findAll()");
		List<SmokeSite> list = (List<SmokeSite>)smokeSiteRepository.findAll();
		logger.info("[SmokeSitePersistenceImpl] 调用方法findAll() 查询结果List<SmokeSite>为: {}", list);
		return list;
	}

	@Override
	public List<String> getAllFactory() {
		logger.info("[SmokeSitePersistenceImpl] 调用方法getAllFactory()");
		List<String> list = smokeSiteRepository.getAllFactory();
		logger.info("[SmokeSitePersistenceImpl] 调用方法getAllFactory() 查询结果List<String>为: {}", list);
		return list;
	}

	@Override
	public List<String> getPollutionByFactory(String factoryName) {
		logger.info("[SmokeSitePersistenceImpl] 调用方法getPollutionByFactory() 传入参数factoryName : {} ", factoryName);
		List<String> list = smokeSiteRepository.getPollutionByFactory(factoryName);
		logger.info("[SmokeSitePersistenceImpl] 调用方法getPollutionByFactory() 传入参数factoryName : {}, 查询结果List<String>为: {}", factoryName, list);
		return list;
	}

	@Override
	public SmokeSite findByFactoryAndPollution(String factoryName, String pollutionName) {
		logger.info("[SmokeSitePersistenceImpl] 调用方法findByFactoryAndPollution() 传入参数factoryName : {}, pollutionName : {}", factoryName, pollutionName);
		SmokeSite smokeSite = smokeSiteRepository.findByFactoryAndPollution(factoryName, pollutionName);
		logger.info("[SmokeSitePersistenceImpl] 调用方法findByFactoryAndPollution() 传入参数factoryName : {}, pollutionName : {}, 查询结果SmokeSite为: {}", factoryName, pollutionName, smokeSite);
		return smokeSite;
	}
}
