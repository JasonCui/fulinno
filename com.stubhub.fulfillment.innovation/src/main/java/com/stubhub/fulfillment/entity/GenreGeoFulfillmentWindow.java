package com.stubhub.fulfillment.entity;

public class GenreGeoFulfillmentWindow {
	private FulfillmentWindow fulfillmentWindow;
    private GenreGeo genreGeo;
	private Money baseCost;

	public FulfillmentWindow getFulfillmentWindow() {
		return fulfillmentWindow;
	}

	public void setFulfillmentWindow(FulfillmentWindow fulfillmentWindow) {
		this.fulfillmentWindow = fulfillmentWindow;
	}

    public GenreGeo getGenreGeo() {
        return genreGeo;
    }

    public void setGenreGeo(GenreGeo genreGeo) {
        this.genreGeo = genreGeo;
    }

    public Money getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(Money baseCost) {
		this.baseCost = baseCost;
	}

}
