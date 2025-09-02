package com.kh.practice.model.vo;

import java.sql.Date;
import java.util.Objects;

public class PracticeVO {
	private int singerNo;
	private String singerName;
	private String singerMajor;
	private String singerDate;
	private String singerAgency;
	private Date singerRetire;
	public int getSingerNo() {
		return singerNo;
	}
	public void setSingerNo(int singerNo) {
		this.singerNo = singerNo;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getSingerMajor() {
		return singerMajor;
	}
	public void setSingerMajor(String singerMajor) {
		this.singerMajor = singerMajor;
	}
	public String getSingerDate() {
		return singerDate;
	}
	public void setSingerDate(String singerDate) {
		this.singerDate = singerDate;
	}
	public String getSingerAgency() {
		return singerAgency;
	}
	public void setSingerAgency(String singerAgency) {
		this.singerAgency = singerAgency;
	}
	public Date getSingerRetire() {
		return singerRetire;
	}
	public void setSingerRetire(Date singerRetire) {
		this.singerRetire = singerRetire;
	}
	
	public PracticeVO() {
		super();
	}
	public PracticeVO(String singerName, String singerMajor, String singerDate, String singerAgency) {
		super();
		this.singerName = singerName;
		this.singerMajor = singerMajor;
		this.singerDate = singerDate;
		this.singerAgency = singerAgency;
	}
	@Override
	public int hashCode() {
		return Objects.hash(singerAgency, singerDate, singerMajor, singerName, singerNo, singerRetire);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PracticeVO other = (PracticeVO) obj;
		return Objects.equals(singerAgency, other.singerAgency) && Objects.equals(singerDate, other.singerDate)
				&& Objects.equals(singerMajor, other.singerMajor) && Objects.equals(singerName, other.singerName)
				&& singerNo == other.singerNo && Objects.equals(singerRetire, other.singerRetire);
	}
	@Override
	public String toString() {
		return "PracticeVO [singerNo=" + singerNo + ", singerName=" + singerName + ", singerMajor=" + singerMajor
				+ ", singerDate=" + singerDate + ", singerAgency=" + singerAgency + ", singerRetire=" + singerRetire
				+ "]";
	}
	
	
}
