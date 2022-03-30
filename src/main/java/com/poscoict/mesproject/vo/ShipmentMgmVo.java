package com.poscoict.mesproject.vo;

public class ShipmentMgmVo {
	
	private String receivingDate;
	private String materialNumber;
	private String prdtName;
	private int weightReceiving;
	private int weightShipment;
	private String vendorName;
    private String vendorManager;
    private String clientCompany;
    private String shipmentDate;
    private String carNumber;
    
	public String getReceivingDate() {
		return receivingDate;
	}
	public void setReceivingDate(String receivingDate) {
		this.receivingDate = receivingDate;
	}
	public String getMaterialNumber() {
		return materialNumber;
	}
	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}
	public String getPrdtName() {
		return prdtName;
	}
	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}
	public int getWeightReceiving() {
		return weightReceiving;
	}
	public void setWeightReceiving(int weightReceiving) {
		this.weightReceiving = weightReceiving;
	}
	public int getWeightShipment() {
		return weightShipment;
	}
	public void setWeightShipment(int weightShipment) {
		this.weightShipment = weightShipment;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorManager() {
		return vendorManager;
	}
	public void setVendorManager(String vendorManager) {
		this.vendorManager = vendorManager;
	}
	public String getClientCompany() {
		return clientCompany;
	}
	public void setClientCompany(String clientCompany) {
		this.clientCompany = clientCompany;
	}
	public String getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
	@Override
	public String toString() {
		return "MaterialMgmVo [receivingDate=" + receivingDate + ", materialNumber=" + materialNumber + ", prdtName="
				+ prdtName + ", weightReceiving=" + weightReceiving + ", weightShipment=" + weightShipment
				+ ", vendorName=" + vendorName + ", vendorManager=" + vendorManager + ", clientCompany=" + clientCompany
				+ ", shipmentDate=" + shipmentDate + ", carNumber=" + carNumber + "]";
	}

}
