package com.web.services.android.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="waterSite")
public class WaterSite {
	@Id
	@GeneratedValue
	private int id;
	private String site;//采样地点
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	@Override
	public String toString() {
		return "WaterSite [id=" + id + ", site=" + site + "]";
	}
}
