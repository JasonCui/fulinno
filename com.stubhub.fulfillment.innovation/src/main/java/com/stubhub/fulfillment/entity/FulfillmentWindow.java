package com.stubhub.fulfillment.entity;

public class FulfillmentWindow {
	private FulfillmentMethod fulfillmentMethod;
	private DeliveryMethod deliveryMethod;
	private Money baseCost;
	private String timeWindow;//-1d-3h
	public FulfillmentMethod getFulfillmentMethod() {
		return fulfillmentMethod;
	}
	public void setFulfillmentMethod(FulfillmentMethod fulfillmentMethod) {
		this.fulfillmentMethod = fulfillmentMethod;
	}
	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
}
