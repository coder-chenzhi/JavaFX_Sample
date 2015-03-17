package application.tableview;

import javafx.beans.property.SimpleStringProperty;

public class InboundBean {
	private SimpleStringProperty arrivalTime = new SimpleStringProperty("");
	private SimpleStringProperty consignee = new SimpleStringProperty("");
	private SimpleStringProperty destination = new SimpleStringProperty("");
	private SimpleStringProperty hazMat = new SimpleStringProperty("");
	private SimpleStringProperty eta = new SimpleStringProperty("");
	private SimpleStringProperty location = new SimpleStringProperty("");
	private SimpleStringProperty origin = new SimpleStringProperty("");
	private SimpleStringProperty shipments = new SimpleStringProperty("");
	private SimpleStringProperty temperature = new SimpleStringProperty("");
	private SimpleStringProperty vfcNumber = new SimpleStringProperty("");
	private SimpleStringProperty vfcPlan = new SimpleStringProperty("");
	
	public InboundBean() {
	}

	public String getArrivalTime() {
		return arrivalTime.get();
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime.set(arrivalTime);
	}

	public String getConsignee() {
		return consignee.get();
	}

	public void setConsignee(String consignee) {
		this.consignee.set(consignee);
	}

	public String getDestination() {
		return destination.get();
	}

	public void setDestination(String destination) {
		this.destination.set(destination);
	}

	public String getHazMat() {
		return hazMat.get();
	}

	public void setHazMat(String hazMat) {
		this.hazMat.set(hazMat);
	}

	public String getEta() {
		return eta.get();
	}

	public void setEta(String eta) {
		this.eta.set(eta);
	}

	public String getLocation() {
		return location.get();
	}

	public void setLocation(String location) {
		this.location.set(location);
	}

	public String getOrigin() {
		return origin.get();
	}

	public void setOrigin(String origin) {
		this.origin.set(origin);
	}

	public String getShipments() {
		return shipments.get();
	}

	public void setShipments(String shipments) {
		this.shipments.set(shipments);
	}

	public String getTemperature() {
		return temperature.get();
	}

	public void setTemperature(String temperature) {
		this.temperature.set(temperature);
	}

	public String getVfcNumber() {
		return vfcNumber.get();
	}

	public void setVfcNumber(String vfcNumber) {
		this.vfcNumber.set(vfcNumber);
	}

	public String getVfcPlan() {
		return vfcPlan.get();
	}

	public void setVfcPlan(String vfcPlan) {
		this.vfcPlan.set(vfcPlan);
	}

}