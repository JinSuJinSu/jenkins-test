package com.poscoict.mesproject.vo;

public class MaterialMgmVo {
	
	private String materialNumber;
	private int prdtThickness;
	private int prdtWidth;
	private int prdtLength;
	private int weightReceiving;
	private String workMethod;
	private String statusCd;
	private String processCd;
	private int sequence;
	private String factory;
	private int weightPrd;
	
	public String getMaterialNumber() {
		return materialNumber;
	}
	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}
	public int getPrdtThickness() {
		return prdtThickness;
	}
	public void setPrdtThickness(int prdtThickness) {
		this.prdtThickness = prdtThickness;
	}
	public int getPrdtWidth() {
		return prdtWidth;
	}
	public void setPrdtWidth(int prdtWidth) {
		this.prdtWidth = prdtWidth;
	}
	public int getPrdtLength() {
		return prdtLength;
	}
	public void setPrdtLength(int prdtLength) {
		this.prdtLength = prdtLength;
	}
	public int getWeightReceiving() {
		return weightReceiving;
	}
	public void setWeightReceiving(int weightReceiving) {
		this.weightReceiving = weightReceiving;
	}
	public String getWorkMethod() {
		return workMethod;
	}
	public void setWorkMethod(String workMethod) {
		this.workMethod = workMethod;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public String getProcessCd() {
		return processCd;
	}
	public void setProcessCd(String processCd) {
		this.processCd = processCd;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public int getWeightPrd() {
		return weightPrd;
	}
	public void setWeightPrd(int weightPrd) {
		this.weightPrd = weightPrd;
	}
	
	@Override
	public String toString() {
		return "MaterialMgmVo [materialNumber=" + materialNumber + ", prdtThickness=" + prdtThickness + ", prdtWidth="
				+ prdtWidth + ", prdtLength=" + prdtLength + ", weightReceiving=" + weightReceiving + ", workMethod="
				+ workMethod + ", statusCd=" + statusCd + ", processCd=" + processCd + ", sequence=" + sequence
				+ ", factory=" + factory + ", weightPrd=" + weightPrd + "]";
	}	
	
	
	
	
	
	

	
    

}
