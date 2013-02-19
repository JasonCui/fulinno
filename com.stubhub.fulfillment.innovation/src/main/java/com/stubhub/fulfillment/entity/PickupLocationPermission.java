package com.stubhub.fulfillment.entity;

public class PickupLocationPermission {
	private FulfillmentWindow fulfillmentWindow;
	private LMSLocation lmsLocation;
    private GenreGeo genreGeo;
	private Money baseCost;// override base cost
	private boolean active;

	public FulfillmentWindow getFulfillmentWindow() {
		return fulfillmentWindow;
	}

	public void setFulfillmentWindow(FulfillmentWindow fulfillmentWindow) {
		this.fulfillmentWindow = fulfillmentWindow;
	}

	public LMSLocation getLmsLocation() {
		return lmsLocation;
	}

	public void setLmsLocation(LMSLocation lmsLocation) {
		this.lmsLocation = lmsLocation;
	}

    public GenreGeo getGenreGeo() {
        return genreGeo;
    }

    public void setGenreGeo(GenreGeo genreGeo) {
        this.genreGeo = genreGeo;
    }

    public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Money getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(Money baseCost) {
		this.baseCost = baseCost;
	}
	
}
