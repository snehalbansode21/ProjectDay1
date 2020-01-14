package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Event_Tb")
public class Event 
{
	private Integer eventId;
	private Date eventDate;
	private int noOfGuests;
	private int eventDuration;
	private double decorationBudget;
	private boolean theme;
	private boolean musicSystem;
	private double costWithoutDiscount;
	private int discount;
	private double costWithDiscount;
	public Event()
	{
		
	}
	
	public Event(Date eventDate, int noOfGuests, int eventDuration, double decorationBudget,
			boolean theme, boolean musicSystem, double costWithoutDiscount, int discount, double costWithDiscount) {
		super();
		this.eventDate = eventDate;
		this.noOfGuests = noOfGuests;
		this.eventDuration = eventDuration;
		this.decorationBudget = decorationBudget;
		this.theme = theme;
		this.musicSystem = musicSystem;
		this.costWithoutDiscount = costWithoutDiscount;
		this.discount = discount;
		this.costWithDiscount = costWithDiscount;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "event_date")
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	@Column(name = "no_of_guests")
	public int getNoOfGuests() {
		return noOfGuests;
	}
	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}
	public int getEventDuration() {
		return eventDuration;
	}
	public void setEventDuration(int eventDuration) {
		this.eventDuration = eventDuration;
	}
	public double getDecorationBudget() {
		return decorationBudget;
	}
	public void setDecorationBudget(double decorationBudget) {
		this.decorationBudget = decorationBudget;
	}
	public boolean isTheme() {
		return theme;
	}
	public void setTheme(boolean theme) {
		this.theme = theme;
	}
	public boolean isMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(boolean musicSystem) {
		this.musicSystem = musicSystem;
	}
	@Column(name = "cost_without_discount")
	public double getCostWithoutDiscount() {
		return costWithoutDiscount;
	}
	public void setCostWithoutDiscount(double costWithoutDiscount) {
		this.costWithoutDiscount = costWithoutDiscount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Column(name = "cost_with_discount")
	public double getCostWithDiscount() {
		return costWithDiscount;
	}
	public void setCostWithDiscount(double costWithDiscount) {
		this.costWithDiscount = costWithDiscount;
	}
	
}
