package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "VenueCity_Tb")
public class VenueCity 
{
	private Integer venueCityId;
	private String venueCityName;
	public VenueCity() {
		// TODO Auto-generated constructor stub
	}
	public VenueCity(String venueCityName) {
		super();
		this.venueCityName = venueCityName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "venueCity_id")
	public Integer getVenueCityId() {
		return venueCityId;
	}
	public void setVenueCityId(Integer venueCityId) {
		this.venueCityId = venueCityId;
	}
	@Column(length = 30)
	public String getVenueCityName() {
		return venueCityName;
	}
	public void setVenueCityName(String venueCityName) {
		this.venueCityName = venueCityName;
	}
	@Override
	public String toString() {
		return "VenueCity [venueCityId=" + venueCityId + ", venueCityName=" + venueCityName + "]";
	}
	
}
