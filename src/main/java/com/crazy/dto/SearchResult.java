package com.crazy.dto;

import com.crazy.model.CrazyHotel;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {
    private static final long serialVersionUID = 1L;

    private List<CrazyHotel> crazyHotels = new ArrayList<>();

    public List<CrazyHotel> getHotels() {
        return crazyHotels;
    }

    public void addHotels(List<CrazyHotel> crazyHotels) {
        this.crazyHotels.addAll(crazyHotels);
    }
}
