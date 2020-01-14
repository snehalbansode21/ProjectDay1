package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "EventDesc_Tb")
public class EventDesc 
{
	private Integer eventDescId;
	private String eventName;
	public EventDesc()
	{
		
	}
	public EventDesc(String eventName) {
		super();
		this.eventName = eventName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eventDesc_id")
	public Integer getEventDescId() {
		return eventDescId;
	}
	public void setEventDescId(Integer eventDescId) {
		this.eventDescId = eventDescId;
	}
	@Column(length = 30)
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	@Override
	public String toString() {
		return "EventDesc [eventDescId=" + eventDescId + ", eventName=" + eventName + "]";
	}
	

}
