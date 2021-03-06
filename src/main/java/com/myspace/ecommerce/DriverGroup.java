package com.myspace.ecommerce;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DriverGroup implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String product;
	private java.lang.Integer minPerHr;
	private java.lang.Integer firstStop;
	private java.lang.Integer costPerStop;
	private java.lang.Integer tripTime;
	private java.lang.Integer mtDurationHr;
	private java.lang.Integer maxDistKM;
	private java.lang.Integer maxWeight;
	private java.lang.Float maxDiamentionWT;
	private java.lang.Integer cargoDimL;
	private java.lang.Integer cargoDimW;
	private java.lang.Integer cargoDimH;

	public DriverGroup() {
	}

	public java.lang.String getProduct() {
		return this.product;
	}

	public void setProduct(java.lang.String product) {
		this.product = product;
	}

	public java.lang.Integer getMinPerHr() {
		return this.minPerHr;
	}

	public void setMinPerHr(java.lang.Integer minPerHr) {
		this.minPerHr = minPerHr;
	}

	public java.lang.Integer getFirstStop() {
		return this.firstStop;
	}

	public void setFirstStop(java.lang.Integer firstStop) {
		this.firstStop = firstStop;
	}

	public java.lang.Integer getCostPerStop() {
		return this.costPerStop;
	}

	public void setCostPerStop(java.lang.Integer costPerStop) {
		this.costPerStop = costPerStop;
	}

	public java.lang.Integer getTripTime() {
		return this.tripTime;
	}

	public void setTripTime(java.lang.Integer tripTime) {
		this.tripTime = tripTime;
	}

	public java.lang.Integer getMtDurationHr() {
		return this.mtDurationHr;
	}

	public void setMtDurationHr(java.lang.Integer mtDurationHr) {
		this.mtDurationHr = mtDurationHr;
	}

	public java.lang.Integer getMaxDistKM() {
		return this.maxDistKM;
	}

	public void setMaxDistKM(java.lang.Integer maxDistKM) {
		this.maxDistKM = maxDistKM;
	}

	public java.lang.Integer getMaxWeight() {
		return this.maxWeight;
	}

	public void setMaxWeight(java.lang.Integer maxWeight) {
		this.maxWeight = maxWeight;
	}

	public java.lang.Float getMaxDiamentionWT() {
		return this.maxDiamentionWT;
	}

	public void setMaxDiamentionWT(java.lang.Float maxDiamentionWT) {
		this.maxDiamentionWT = maxDiamentionWT;
	}

	public java.lang.Integer getCargoDimL() {
		return this.cargoDimL;
	}

	public void setCargoDimL(java.lang.Integer cargoDimL) {
		this.cargoDimL = cargoDimL;
	}

	public java.lang.Integer getCargoDimW() {
		return this.cargoDimW;
	}

	public void setCargoDimW(java.lang.Integer cargoDimW) {
		this.cargoDimW = cargoDimW;
	}

	public java.lang.Integer getCargoDimH() {
		return this.cargoDimH;
	}

	public void setCargoDimH(java.lang.Integer cargoDimH) {
		this.cargoDimH = cargoDimH;
	}

	public DriverGroup(java.lang.String product, java.lang.Integer minPerHr,
			java.lang.Integer firstStop, java.lang.Integer costPerStop,
			java.lang.Integer tripTime, java.lang.Integer mtDurationHr,
			java.lang.Integer maxDistKM, java.lang.Integer maxWeight,
			java.lang.Float maxDiamentionWT, java.lang.Integer cargoDimL,
			java.lang.Integer cargoDimW, java.lang.Integer cargoDimH) {
		this.product = product;
		this.minPerHr = minPerHr;
		this.firstStop = firstStop;
		this.costPerStop = costPerStop;
		this.tripTime = tripTime;
		this.mtDurationHr = mtDurationHr;
		this.maxDistKM = maxDistKM;
		this.maxWeight = maxWeight;
		this.maxDiamentionWT = maxDiamentionWT;
		this.cargoDimL = cargoDimL;
		this.cargoDimW = cargoDimW;
		this.cargoDimH = cargoDimH;
	}

}