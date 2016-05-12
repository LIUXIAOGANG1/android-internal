package com.web.services.android.persistences;

import java.util.List;

import com.web.services.android.beans.SmokeSite;

public interface SmokeSitePersistence {
	public SmokeSite findOne(String id);
	
	public SmokeSite findByPollutionName(String pollutionName);
	
	public List<SmokeSite> findAll();
	
	public List<String> getAllFactory();
	
	public List<String> getPollutionByFactory(String factoryName);
	
	public SmokeSite findByFactoryAndPollution(String factoryName, String pollutionName);
}
