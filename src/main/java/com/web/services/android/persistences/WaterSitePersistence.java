package com.web.services.android.persistences;

import java.util.List;

import com.web.services.android.beans.WaterSite;

public interface WaterSitePersistence {
	public WaterSite findOne(int id);
	
	public WaterSite findBySite(String site);
	
	public List<WaterSite> findAll();
	
	public List<String> findAllSit();
}
