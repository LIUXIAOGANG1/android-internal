package com.web.services.android.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.web.services.android.beans.WaterData;

public interface WaterDataRepository extends CrudRepository<WaterData, Integer> {

	public List<WaterData> findByWaterSiteId(int waterSiteId);
	
	@Query("from waterData w where w.waterSiteId = :siteId AND w.samplingTime >= :start AND w.samplingTime <= :end")
	public Page<WaterData> findBySiteIdAndTime(@Param("siteId")int siteId, @Param("start")Date start, @Param("end")Date end, Pageable pageable);
}
