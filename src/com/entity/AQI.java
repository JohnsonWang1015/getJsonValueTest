package com.entity;

import java.util.HashMap;
import java.util.Map;

public class AQI {

	private String siteName;
	private String county;
	private String aqi;
	private String pollutant;
	private String status;
	private String so2;
	private String co;
	private String cO8hr;
	private String o3;
	private String o38hr;
	private String pm10;
	private String pm25;
	private String no2;
	private String nOx;
	private String no;
	private String windSpeed;
	private String windDirec;
	private String publishTime;
	private String pm25Avg;
	private String pm10Avg;
	private String so2Avg;
	private String longitude;
	private String latitude;
	private String siteId;
	private String importDate;


	public AQI() {
	}

	public AQI(String siteName, String county, String aqi, String pollutant, String status, String so2, String co,
			String cO8hr, String o3, String o38hr, String pm10, String pm25, String no2, String nOx, String no,
			String windSpeed, String windDirec, String publishTime, String pm25Avg, String pm10Avg, String so2Avg,
			String longitude, String latitude, String siteId, String importDate) {
		super();
		this.siteName = siteName;
		this.county = county;
		this.aqi = aqi;
		this.pollutant = pollutant;
		this.status = status;
		this.so2 = so2;
		this.co = co;
		this.cO8hr = cO8hr;
		this.o3 = o3;
		this.o38hr = o38hr;
		this.pm10 = pm10;
		this.pm25 = pm25;
		this.no2 = no2;
		this.nOx = nOx;
		this.no = no;
		this.windSpeed = windSpeed;
		this.windDirec = windDirec;
		this.publishTime = publishTime;
		this.pm25Avg = pm25Avg;
		this.pm10Avg = pm10Avg;
		this.so2Avg = so2Avg;
		this.longitude = longitude;
		this.latitude = latitude;
		this.siteId = siteId;
		this.importDate = importDate;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getAqi() {
		return aqi;
	}

	public void setAqi(String aqi) {
		this.aqi = aqi;
	}

	public String getPollutant() {
		return pollutant;
	}

	public void setPollutant(String pollutant) {
		this.pollutant = pollutant;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSo2() {
		return so2;
	}

	public void setSo2(String so2) {
		this.so2 = so2;
	}

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getCO8hr() {
		return cO8hr;
	}

	public void setCO8hr(String cO8hr) {
		this.cO8hr = cO8hr;
	}

	public String getO3() {
		return o3;
	}

	public void setO3(String o3) {
		this.o3 = o3;
	}

	public String getO38hr() {
		return o38hr;
	}

	public void setO38hr(String o38hr) {
		this.o38hr = o38hr;
	}

	public String getPm10() {
		return pm10;
	}

	public void setPm10(String pm10) {
		this.pm10 = pm10;
	}

	public String getPm25() {
		return pm25;
	}

	public void setPm25(String pm25) {
		this.pm25 = pm25;
	}

	public String getNo2() {
		return no2;
	}

	public void setNo2(String no2) {
		this.no2 = no2;
	}

	public String getNOx() {
		return nOx;
	}

	public void setNOx(String nOx) {
		this.nOx = nOx;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getWindDirec() {
		return windDirec;
	}

	public void setWindDirec(String windDirec) {
		this.windDirec = windDirec;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getPm25Avg() {
		return pm25Avg;
	}

	public void setPm25Avg(String pm25Avg) {
		this.pm25Avg = pm25Avg;
	}

	public String getPm10Avg() {
		return pm10Avg;
	}

	public void setPm10Avg(String pm10Avg) {
		this.pm10Avg = pm10Avg;
	}

	public String getSo2Avg() {
		return so2Avg;
	}

	public void setSo2Avg(String so2Avg) {
		this.so2Avg = so2Avg;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getImportDate() {
		return importDate;
	}

	public void setImportDate(String importDate) {
		this.importDate = importDate;
	}
	
	public Map<String, String> getAQIData(){
		
		Map<String, String> map = new HashMap<>();
		map.put("siteName", siteName);
		map.put("county", county);
		map.put("aqi", aqi);
		map.put("pollutant", pollutant);
		map.put("status", status);
		map.put("so2", so2);
		map.put("co", co);
		map.put("cO8hr", cO8hr);
		map.put("o3", o3);
		map.put("o38hr", o38hr);
		map.put("pm10", pm10);
		map.put("pm25", pm25);
		map.put("no2", no2);
		map.put("nOx", nOx);
		map.put("no", no);
		map.put("windSpeed", windSpeed);
		map.put("windDirec", windDirec);
		map.put("publishTime", publishTime);
		map.put("pm25Avg", pm25Avg);
		map.put("pm10Avg", pm10Avg);
		map.put("so2Avg", so2Avg);
		map.put("longitude", longitude);
		map.put("latitude", latitude);
		map.put("siteId", siteId);
		map.put("importDate", importDate);
		
		return map;
	}

	@Override
	public String toString() {
		return "AQI [siteName=" + siteName + ", county=" + county + ", aqi=" + aqi + ", pollutant=" + pollutant
				+ ", status=" + status + ", so2=" + so2 + ", co=" + co + ", cO8hr=" + cO8hr + ", o3=" + o3 + ", o38hr="
				+ o38hr + ", pm10=" + pm10 + ", pm25=" + pm25 + ", no2=" + no2 + ", nOx=" + nOx + ", no=" + no
				+ ", windSpeed=" + windSpeed + ", windDirec=" + windDirec + ", publishTime=" + publishTime
				+ ", pm25Avg=" + pm25Avg + ", pm10Avg=" + pm10Avg + ", so2Avg=" + so2Avg + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", siteId=" + siteId + ", importDate=" + importDate + "]";
	}
	
}