package com.stubhub.fulfillment.entity;

public class FulfillmentUserGroupPermission {
	private UserGroup allowedUserGroup;
	private FulfillmentWindow fillmentWindow;
    private GenreGeo genreGeo;
	private Money baseCost;// override base cost

    public FulfillmentWindow getFillmentWindow() {
        return fillmentWindow;
    }

    public void setFillmentWindow(FulfillmentWindow fillmentWindow) {
        this.fillmentWindow = fillmentWindow;
    }

    public GenreGeo getGenreGeo() {
        return genreGeo;
    }

    public void setGenreGeo(GenreGeo genreGeo) {
        this.genreGeo = genreGeo;
    }

    public UserGroup getAllowedUserGroup() {
		return allowedUserGroup;
	}

	public void setAllowedUserGroup(UserGroup allowedUserGroup) {
		this.allowedUserGroup = allowedUserGroup;
	}

	public Money getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(Money baseCost) {
		this.baseCost = baseCost;
	}

}
