package com.crazy.dto;

public class SearchRequest {

    private String city;

 	private String fromDate;

 	private String toDate;

 	private int numberOfAdults;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFrom() {
        return fromDate;
    }

    public void setFrom(String from) {
        this.fromDate = from;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }
}
