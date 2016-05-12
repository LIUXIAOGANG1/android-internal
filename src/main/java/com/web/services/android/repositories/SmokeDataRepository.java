package com.web.services.android.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.web.services.android.beans.SmokeData;

public interface SmokeDataRepository extends CrudRepository<SmokeData, Integer> {

	public List<SmokeData> findBySmokeSiteId(String smokeSiteId);
	
	@Query("from smokeData w where w.smokeSiteId = :siteId AND w.time >= :start AND w.time <= :end")
	public List<SmokeData> findBySiteIdAndTime(@Param("siteId")String siteId, @Param("start")Date start, @Param("end")Date end, Pageable pageable);
	
	
}
