package com.web.services.android.persistences;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;

import com.web.services.android.beans.WaterData;

public interface WaterDataPersistence {
	public WaterData findone(int id);
	
	public List<WaterData> findByWaterSiteId(int waterSiteId);
	
	public List<WaterData> findBySiteIdAndTime(int siteId, Date start, Date end, Pageable pageable);
}
