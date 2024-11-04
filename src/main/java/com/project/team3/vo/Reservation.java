package com.project.team3.vo;

public class Reservation {
	
	public String reservationId;
	public String reservationName;
	public String reservationDate;
	public String startHour;
	public String endHour;
	public String participants;
	public int facilityId;
	public String userId;
	
	public Reservation(int facilityId, String reservationDate) {
		this.facilityId = facilityId;
		this.reservationDate = reservationDate;
	}
	
	
	
	public Reservation() {
		
	}



	public Reservation(String reservationId, String reservationName, String reservationDate, String startHour,
			String endHour, String participants, int facilityId, String userId) {
		this.reservationId = reservationId;
		this.reservationName = reservationName;
		this.reservationDate = reservationDate;
		this.startHour = startHour;
		this.endHour = endHour;
		this.participants = participants;
		this.facilityId = facilityId;
		this.userId = userId;
	}
	
	
	public Reservation(String reservationName, String reservationDate, String startHour,
			String endHour, String participants, int facilityId, String userId) {
		this.reservationName = reservationName;
		this.reservationDate = reservationDate;
		this.startHour = startHour;
		this.endHour = endHour;
		this.participants = participants;
		this.facilityId = facilityId;
		this.userId = userId;
	}
	
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public String getReservationName() {
		return reservationName;
	}
	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	public String getStartHour() {
		return startHour;
	}
	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}
	public String getEndHour() {
		return endHour;
	}
	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}
	public String getParticipants() {
		return participants;
	}
	public void setParticipants(String participants) {
		this.participants = participants;
	}
	public int getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", reservationName=" + reservationName
				+ ", reservationDate=" + reservationDate + ", startHour=" + startHour + ", endHour=" + endHour
				+ ", participants=" + participants + ", facilityId=" + facilityId + ", userId=" + userId + "]";
	}
	
	
}
