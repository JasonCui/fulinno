package com.stubhub.fulfillment.entity;

public class FulfillmentUserGroupPermission {
	private UserGroup allowedUserGroup;
	private GenreGeoFulfillmentWindow genreGeoFulfillmentWindow;
	private Long genreId;
	private Long geoId;
	private Money baseCost;// override base cost
	
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

	public UserGroup getAllowedUserGroup() {
		return allowedUserGroup;
	}

	public void setAllowedUserGroup(UserGroup allowedUserGroup) {
		this.allowedUserGroup = allowedUserGroup;
	}

	public GenreGeoFulfillmentWindow getGenreGeoFulfillmentWindow() {
		return genreGeoFulfillmentWindow;
	}

	public void setGenreGeoFulfillmentWindow(
			GenreGeoFulfillmentWindow genreGeoFulfillmentWindow) {
		this.genreGeoFulfillmentWindow = genreGeoFulfillmentWindow;
	}

	public Money getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(Money baseCost) {
		this.baseCost = baseCost;
	}

}
