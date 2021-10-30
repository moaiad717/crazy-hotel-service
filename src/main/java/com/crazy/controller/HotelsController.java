package com.crazy.controller;

import com.crazy.model.CrazyHotel;
import com.crazy.dto.SearchRequest;
import com.crazy.dto.SearchResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelsController {

    @PostMapping("CrazyHotels")
    @ResponseBody
    public SearchResult findHotels(@RequestBody SearchRequest searchRequest) {

        /* Create and return Dummy Results */
        List<CrazyHotel> crazyHotels = new ArrayList<>();
        crazyHotels.add(createDummyHotel("82.6", "Sheraton", new String[]{"Hair dryer", "Kitchen", "TV"}));
        crazyHotels.add(createDummyHotel("22.8", "Mariot", new String[]{"Swim bool", "Jakozi", "TV"}));

        SearchResult searchResult = new SearchResult();
        searchResult.addHotels(crazyHotels);
        return searchResult;
    }

    /**
     *  Create Dummy CrazyHotel Objects
     *
     * @param price
     * @param name
     * @param roomAmenities
     * @return
     */
    private CrazyHotel createDummyHotel(String price, String name, String[] roomAmenities) {
        CrazyHotel crazyHotel = new CrazyHotel();
        crazyHotel.setPrice(price);
        crazyHotel.setHotelName(name);
        crazyHotel.setRate("****");
        crazyHotel.setAmenities(roomAmenities);
        return crazyHotel;
    }


}
