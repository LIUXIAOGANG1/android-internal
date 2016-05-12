package com.web.services.android.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="smokeData")
public class SmokeData {
	@Id
	@GeneratedValue
	private int id;
	private String smokeSiteId;
	private Date time;	//检测日期
	private String type;	//检测种类
	private String project;	//检测项目
	private String flow;//烟尘流量
	private String averageConcentration;//平均浓度
	private String highestConcentration;//最高浓度
	private String emission;//排放量
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSmokeSiteId() {
		return smokeSiteId;
	}
	public void setSmokeSiteId(String smokeSiteId) {
		this.smokeSiteId = smokeSiteId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getFlow() {
		return flow;
	}
	public void setFlow(String flow) {
		this.flow = flow;
	}
	public String getAverageConcentration() {
		return averageConcentration;
	}
	public void setAverageConcentration(String averageConcentration) {
		this.averageConcentration = averageConcentration;
	}
	public String getHighestConcentration() {
		return highestConcentration;
	}
	public void setHighestConcentration(String highestConcentration) {
		this.highestConcentration = highestConcentration;
	}
	public String getEmission() {
		return emission;
	}
	public void setEmission(String emission) {
		this.emission = emission;
	}
	@Override
	public String toString() {
		return "SmokeData [id=" + id + ", smokeSiteId=" + smokeSiteId + ", time=" + time + ", type=" + type
				+ ", project=" + project + ", flow=" + flow + ", averageConcentration=" + averageConcentration
				+ ", highestConcentration=" + highestConcentration + ", emission=" + emission + "]";
	}
}
