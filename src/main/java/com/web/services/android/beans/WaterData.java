package com.web.services.android.beans;//

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="waterData")
public class WaterData {
	@Id
	@GeneratedValue
	private int id;////
	private int waterSiteId;//
	private Date samplingTime;//采样时间
	private String airTemperature;//气温 (℃)
	private String waterTemperature;//水温 (℃)
	private String PH;//
	private String surface;//外观
	private String totalSolids;//总固体 (mg/L)
	private String dissolvedSolids;//溶解固 (mg/L)
	private String seston;//悬浮物 (mg/L)
	private String sulfide;//硫化物 (mg/L)
	private String phenol;//酚 (mg/L)
	private String totalHardness;//总硬度 (mg/L)
	private String calciumHardness;//钙硬度 (mg/L)
	private String magnesiumHardness;//镁硬度 (mg/L)
	private String phenolTitaniumAlkalinity;//酚钛碱度(mg/L)
	private String methylOrangeAlkalinity;//甲基橙碱度(mg/L)
	private String totalAlkalinity;//总碱度 (mg/L)
	private String chloride;//氯化物 (mg/L)
	private String oxygenUptake;//耗氧量 (mg/L)
	private String arsenic;//砷   (mg/L)
	private String dissolvedOxygen;//溶解氧 (mg/L)
	private String rateDissolvedOxygen;//溶解氧百分率
	private String totalChromium;//总铬 (mg/L)
	private String cyanide;//氰化物 (mg/L)
	private String fluoride;//氟化物 (mg/L)
	private String chromium;//六价铬 (mg/L)
	private String iol;//油 (mg/L)
	private String benzo;//3,4苯并芘(ug/m3)
	private String ammoniaNitrogen;//氨氮 (mg/L)
	private String iron;//铁 (mg/L)
	private String manganese;//锰 (mg/L)
	private String copper;//铜 (mg/L)
	private String lead;//铅 (mg/L)
	private String cadmium;//镉 (mg/L)
	private String zine;//锌 (mg/L)
	private String totalDisplacement;//总排水量 (T/h)
	private String mTotalHardness;//总硬度(mmol/L)
	private String carbonateAlkalinity;//碳酸盐碱度(mol/L)
	private String bicarbonateAlkalinity;//重碳酸盐碱度(mol/L)
	private String turbidity;//浊度
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWaterSiteId() {
		return waterSiteId;
	}
	public void setWaterSiteId(int waterSiteId) {
		this.waterSiteId = waterSiteId;
	}
	public Date getSamplingTime() {
		return samplingTime;
	}
	public void setSamplingTime(Date samplingTime) {
		this.samplingTime = samplingTime;
	}
	public String getAirTemperature() {
		return airTemperature;
	}
	public void setAirTemperature(String airTemperature) {
		this.airTemperature = airTemperature;
	}
	public String getWaterTemperature() {
		return waterTemperature;
	}
	public void setWaterTemperature(String waterTemperature) {
		this.waterTemperature = waterTemperature;
	}
	public String getPH() {
		return PH;
	}
	public void setPH(String pH) {
		PH = pH;
	}
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public String getTotalSolids() {
		return totalSolids;
	}
	public void setTotalSolids(String totalSolids) {
		this.totalSolids = totalSolids;
	}
	public String getDissolvedSolids() {
		return dissolvedSolids;
	}
	public void setDissolvedSolids(String dissolvedSolids) {
		this.dissolvedSolids = dissolvedSolids;
	}
	public String getSeston() {
		return seston;
	}
	public void setSeston(String seston) {
		this.seston = seston;
	}
	public String getSulfide() {
		return sulfide;
	}
	public void setSulfide(String sulfide) {
		this.sulfide = sulfide;
	}
	public String getPhenol() {
		return phenol;
	}
	public void setPhenol(String phenol) {
		this.phenol = phenol;
	}
	public String getTotalHardness() {
		return totalHardness;
	}
	public void setTotalHardness(String totalHardness) {
		this.totalHardness = totalHardness;
	}
	public String getCalciumHardness() {
		return calciumHardness;
	}
	public void setCalciumHardness(String calciumHardness) {
		this.calciumHardness = calciumHardness;
	}
	public String getMagnesiumHardness() {
		return magnesiumHardness;
	}
	public void setMagnesiumHardness(String magnesiumHardness) {
		this.magnesiumHardness = magnesiumHardness;
	}
	public String getPhenolTitaniumAlkalinity() {
		return phenolTitaniumAlkalinity;
	}
	public void setPhenolTitaniumAlkalinity(String phenolTitaniumAlkalinity) {
		this.phenolTitaniumAlkalinity = phenolTitaniumAlkalinity;
	}
	public String getMethylOrangeAlkalinity() {
		return methylOrangeAlkalinity;
	}
	public void setMethylOrangeAlkalinity(String methylOrangeAlkalinity) {
		this.methylOrangeAlkalinity = methylOrangeAlkalinity;
	}
	public String getTotalAlkalinity() {
		return totalAlkalinity;
	}
	public void setTotalAlkalinity(String totalAlkalinity) {
		this.totalAlkalinity = totalAlkalinity;
	}
	public String getChloride() {
		return chloride;
	}
	public void setChloride(String chloride) {
		this.chloride = chloride;
	}
	public String getOxygenUptake() {
		return oxygenUptake;
	}
	public void setOxygenUptake(String oxygenUptake) {
		this.oxygenUptake = oxygenUptake;
	}
	public String getArsenic() {
		return arsenic;
	}
	public void setArsenic(String arsenic) {
		this.arsenic = arsenic;
	}
	public String getDissolvedOxygen() {
		return dissolvedOxygen;
	}
	public void setDissolvedOxygen(String dissolvedOxygen) {
		this.dissolvedOxygen = dissolvedOxygen;
	}
	public String getRateDissolvedOxygen() {
		return rateDissolvedOxygen;
	}
	public void setRateDissolvedOxygen(String rateDissolvedOxygen) {
		this.rateDissolvedOxygen = rateDissolvedOxygen;
	}
	public String getTotalChromium() {
		return totalChromium;
	}
	public void setTotalChromium(String totalChromium) {
		this.totalChromium = totalChromium;
	}
	public String getCyanide() {
		return cyanide;
	}
	public void setCyanide(String cyanide) {
		this.cyanide = cyanide;
	}
	public String getFluoride() {
		return fluoride;
	}
	public void setFluoride(String fluoride) {
		this.fluoride = fluoride;
	}
	public String getChromium() {
		return chromium;
	}
	public void setChromium(String chromium) {
		this.chromium = chromium;
	}
	public String getIol() {
		return iol;
	}
	public void setIol(String iol) {
		this.iol = iol;
	}
	public String getBenzo() {
		return benzo;
	}
	public void setBenzo(String benzo) {
		this.benzo = benzo;
	}
	public String getAmmoniaNitrogen() {
		return ammoniaNitrogen;
	}
	public void setAmmoniaNitrogen(String ammoniaNitrogen) {
		this.ammoniaNitrogen = ammoniaNitrogen;
	}
	public String getIron() {
		return iron;
	}
	public void setIron(String iron) {
		this.iron = iron;
	}
	public String getManganese() {
		return manganese;
	}
	public void setManganese(String manganese) {
		this.manganese = manganese;
	}
	public String getCopper() {
		return copper;
	}
	public void setCopper(String copper) {
		this.copper = copper;
	}
	public String getLead() {
		return lead;
	}
	public void setLead(String lead) {
		this.lead = lead;
	}
	public String getCadmium() {
		return cadmium;
	}
	public void setCadmium(String cadmium) {
		this.cadmium = cadmium;
	}
	public String getZine() {
		return zine;
	}
	public void setZine(String zine) {
		this.zine = zine;
	}
	public String getTotalDisplacement() {
		return totalDisplacement;
	}
	public void setTotalDisplacement(String totalDisplacement) {
		this.totalDisplacement = totalDisplacement;
	}
	public String getmTotalHardness() {
		return mTotalHardness;
	}
	public void setmTotalHardness(String mTotalHardness) {
		this.mTotalHardness = mTotalHardness;
	}
	public String getCarbonateAlkalinity() {
		return carbonateAlkalinity;
	}
	public void setCarbonateAlkalinity(String carbonateAlkalinity) {
		this.carbonateAlkalinity = carbonateAlkalinity;
	}
	public String getBicarbonateAlkalinity() {
		return bicarbonateAlkalinity;
	}
	public void setBicarbonateAlkalinity(String bicarbonateAlkalinity) {
		this.bicarbonateAlkalinity = bicarbonateAlkalinity;
	}
	public String getTurbidity() {
		return turbidity;
	}
	public void setTurbidity(String turbidity) {
		this.turbidity = turbidity;
	}
	@Override
	public String toString() {
		return "WaterData [id=" + id + ", waterSiteId=" + waterSiteId + ", samplingTime=" + samplingTime
				+ ", airTemperature=" + airTemperature + ", waterTemperature=" + waterTemperature + ", PH=" + PH
				+ ", surface=" + surface + ", totalSolids=" + totalSolids + ", dissolvedSolids=" + dissolvedSolids
				+ ", seston=" + seston + ", sulfide=" + sulfide + ", phenol=" + phenol + ", totalHardness="
				+ totalHardness + ", calciumHardness=" + calciumHardness + ", magnesiumHardness=" + magnesiumHardness
				+ ", phenolTitaniumAlkalinity=" + phenolTitaniumAlkalinity + ", methylOrangeAlkalinity="
				+ methylOrangeAlkalinity + ", totalAlkalinity=" + totalAlkalinity + ", chloride=" + chloride
				+ ", oxygenUptake=" + oxygenUptake + ", arsenic=" + arsenic + ", dissolvedOxygen=" + dissolvedOxygen
				+ ", rateDissolvedOxygen=" + rateDissolvedOxygen + ", totalChromium=" + totalChromium + ", cyanide="
				+ cyanide + ", fluoride=" + fluoride + ", chromium=" + chromium + ", iol=" + iol + ", benzo=" + benzo
				+ ", ammoniaNitrogen=" + ammoniaNitrogen + ", iron=" + iron + ", manganese=" + manganese + ", copper="
				+ copper + ", lead=" + lead + ", cadmium=" + cadmium + ", zine=" + zine + ", totalDisplacement="
				+ totalDisplacement + ", mTotalHardness=" + mTotalHardness + ", carbonateAlkalinity="
				+ carbonateAlkalinity + ", bicarbonateAlkalinity=" + bicarbonateAlkalinity + ", turbidity=" + turbidity
				+ "]";
	}
}
