package com.poscoict.mesproject.vo;

public class InstructionHistoryVo {
	
	private String factory;
	private String materialNumber;
	private int sequence;
	private String workInstDate;
	private int weightInst;
	private String dueDate;
	
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getMaterialNumber() {
		return materialNumber;
	}
	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getWorkInstDate() {
		return workInstDate;
	}
	public void setWorkInstDate(String workInstDate) {
		this.workInstDate = workInstDate;
	}
	public int getWeightInst() {
		return weightInst;
	}
	public void setWeightInst(int weightInst) {
		this.weightInst = weightInst;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override
	public String toString() {
		return "InstructionHistoryVo [factory=" + factory + ", materialNumber=" + materialNumber + ", sequence="
				+ sequence + ", workInstDate=" + workInstDate + ", weightInst=" + weightInst + ", dueDate=" + dueDate
				+ "]";
	}
	
	
	
	
	
	
	
	


}
