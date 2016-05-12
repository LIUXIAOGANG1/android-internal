package com.web.services.android.service;

import java.util.List;

import com.web.services.android.beans.WaterData;

public interface WaterService {
	public List<String> findAllSit();
	
	public List<WaterData> findByQuery(String site, String startTime, String endTime, int page);
}
