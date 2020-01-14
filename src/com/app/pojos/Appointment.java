package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Appointment_Tb")
public class Appointment 
{
	private Integer appointmentId;
	private Date appointmentDate;
	public Appointment() {
		// TODO Auto-generated constructor stub
	}
	public Appointment(Date appointmentDate) {
		super();
		this.appointmentDate = appointmentDate;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appointment_id")
	public Integer getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}
	@Column(name = "appointment_date")
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentDate=" + appointmentDate + "]";
	}
	
}
