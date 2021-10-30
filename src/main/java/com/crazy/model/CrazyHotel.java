package com.crazy.model;

public class CrazyHotel {
    private static final long serialVersionUID = 1L;

    private String hotelName;
    /* String of '*' from 1-5 */
    private String rate;
    /* Price  per night*/
    private String price;
    /*Discount */
    private String discount;
    /*List of amenities*/
    private String[] amenities;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String[] getAmenities() {
        return amenities;
    }

    public void setAmenities(String[] amenities) {
        this.amenities = amenities;
    }
}
