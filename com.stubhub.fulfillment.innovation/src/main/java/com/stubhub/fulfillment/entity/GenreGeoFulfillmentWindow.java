package com.stubhub.fulfillment.entity;

public class GenreGeoFulfillmentWindow {
	private FulfillmentWindow fulfillmentWindow;
	private Long genreId;
	private Long geoId;
	private Money baseCost;
	public FulfillmentWindow getFulfillmentWindow() {
		return fulfillmentWindow;
	}

	public void setFulfillmentWindow(FulfillmentWindow fulfillmentWindow) {
		this.fulfillmentWindow = fulfillmentWindow;
	}

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	public Long getGeoId() {
		return geoId;
	}

	public void setGeoId(Long geoId) {
		this.geoId = geoId;
	}

	public Money getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(Money baseCost) {
		this.baseCost = baseCost;
	}

}
