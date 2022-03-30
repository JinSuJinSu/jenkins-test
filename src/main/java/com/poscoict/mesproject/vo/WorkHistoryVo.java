package com.poscoict.mesproject.vo;

public class WorkHistoryVo {
	
	private String materialNumber;
	private String workInstDate;
	private String productionDate;
	private String factory;
	private String workMethod;
	private int weightPrd;
	
	public String getMaterialNumber() {
		return materialNumber;
	}
	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}
	public String getWorkInstDate() {
		return workInstDate;
	}
	public void setWorkInstDate(String workInstDate) {
		this.workInstDate = workInstDate;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getWorkMethod() {
		return workMethod;
	}
	public void setWorkMethod(String workMethod) {
		this.workMethod = workMethod;
	}
	public int getWeightPrd() {
		return weightPrd;
	}
	public void setWeightPrd(int weightPrd) {
		this.weightPrd = weightPrd;
	}
	
	@Override
	public String toString() {
		return "WorkHistoryVo [materialNumber=" + materialNumber + ", workInstDate=" + workInstDate
				+ ", productionDate=" + productionDate + ", factory=" + factory + ", workMethod=" + workMethod
				+ ", weightPrd=" + weightPrd + "]";
	}
	
	
	
	


}
