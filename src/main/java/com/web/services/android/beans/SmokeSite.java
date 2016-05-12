package com.web.services.android.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="smokeSite")
public class SmokeSite {
	@Id
	@GeneratedValue
	private String id;
	private String factoryName;//工厂名称
	private String pollutionName;//污染源名称
	private String smokeStandard;//烟尘标准值
	private String SO2Standard;//SO2标准值
	private String COStandard;//CO标准值
	private String NOXStandard;//NOX标准
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public String getPollutionName() {
		return pollutionName;
	}
	public void setPollutionName(String pollutionName) {
		this.pollutionName = pollutionName;
	}
	public String getSmokeStandard() {
		return smokeStandard;
	}
	public void setSmokeStandard(String smokeStandard) {
		this.smokeStandard = smokeStandard;
	}
	public String getSO2Standard() {
		return SO2Standard;
	}
	public void setSO2Standard(String sO2Standard) {
		SO2Standard = sO2Standard;
	}
	public String getCOStandard() {
		return COStandard;
	}
	public void setCOStandard(String cOStandard) {
		COStandard = cOStandard;
	}
	public String getNOXStandard() {
		return NOXStandard;
	}
	public void setNOXStandard(String nOXStandard) {
		NOXStandard = nOXStandard;
	}
	@Override
	public String toString() {
		return "SmokeSite [id=" + id + ", factoryName=" + factoryName + ", pollutionName=" + pollutionName
				+ ", smokeStandard=" + smokeStandard + ", SO2Standard=" + SO2Standard + ", COStandard=" + COStandard
				+ ", NOXStandard=" + NOXStandard + "]";
	}
}