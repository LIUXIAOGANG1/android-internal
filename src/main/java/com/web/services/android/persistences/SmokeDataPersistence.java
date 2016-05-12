package com.web.services.android.persistences;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;

import com.web.services.android.beans.SmokeData;

public interface SmokeDataPersistence {
	public SmokeData findone(int id);
	
	public List<SmokeData> findBySmokeSiteId(String smokeSiteId);
	
	public List<SmokeData> findBySiteIdAndTime(String siteId, Date start, Date end, Pageable pageable);
}
