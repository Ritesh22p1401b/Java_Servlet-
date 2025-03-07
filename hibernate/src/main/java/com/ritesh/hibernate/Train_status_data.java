package com.ritesh.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="train_status")
public class Train_status_data {
	
	@Id
	private int train_number;
	private String train_depature;
	private String train_arrival;
	private String journey_timming;
	private String seat_availability;
	
	public int getTrain_number() {
		return train_number;
	}
	public void setTrain_number(int train_number) {
		this.train_number = train_number;
	}
	public String getTrain_depature() {
		return train_depature;
	}
	public void setTrain_depature(String train_depature) {
		this.train_depature = train_depature;
	}
	public String getTrain_arrival() {
		return train_arrival;
	}
	public void setTrain_arrival(String train_arrival) {
		this.train_arrival = train_arrival;
	}
	public String getJourney_timming() {
		return journey_timming;
	}
	public void setJourney_timming(String journey_timming) {
		this.journey_timming = journey_timming;
	}
	public String getSeat_availability() {
		return seat_availability;
	}
	public void setSeat_availability(String seat_availability) {
		this.seat_availability = seat_availability;
	}
	@Override
	public String toString() {
		return "Train_status_data [train_number=" + train_number + ", train_depature=" + train_depature
				+ ", train_arrival=" + train_arrival + ", journey_timming=" + journey_timming + ", seat_availability="
				+ seat_availability + "]";
	}
	
	
	

}
