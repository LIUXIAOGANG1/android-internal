package com.web.services.android.service;

import java.util.List;

import com.web.services.android.beans.SmokeData;
import com.web.services.android.beans.SmokeSite;


public interface SmokeService {
	public List<String> getAllFactory();
	
	public List<String> getPollutionByFactory(String factoryName);
	
	public SmokeSite findByFactoryAndPollution(String factoryName, String pollutionName);
	
	public List<SmokeData> findByQuery(String factory, String pollution, String startTime, String endTime, int page);
}
