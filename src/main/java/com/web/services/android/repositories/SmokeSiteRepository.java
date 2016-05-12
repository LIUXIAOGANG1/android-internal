package com.web.services.android.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.web.services.android.beans.SmokeSite;

public interface SmokeSiteRepository extends CrudRepository<SmokeSite, String> {
	
	@Query("SELECT DISTINCT(factoryName) FROM smokeSite")
	public List<String> getAllFactory();
	
	@Query("SELECT pollutionName FROM smokeSite s where s.factoryName = :factoryName")
	public List<String> getPollutionByFactory(@Param("factoryName")String factoryName);

	public SmokeSite findByPollutionName(String pollutionName);
	
	@Query("FROM smokeSite s where s.factoryName = :factoryName AND s.pollutionName = :pollutionName")
	public SmokeSite findByFactoryAndPollution(@Param("factoryName")String factoryName, @Param("pollutionName")String pollutionName);
}
