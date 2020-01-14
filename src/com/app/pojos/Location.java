package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "Location_Tb")
public class Location 
{
	private Integer locationId;
	private String locationName;
	public Location() {
		// TODO Auto-generated constructor stub
	}
	public Location(String locationName) {
		super();
		this.locationName = locationName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	@Column(length = 50,name = "location_name")
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + "]";
	}
	
}
