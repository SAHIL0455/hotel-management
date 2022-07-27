package com.bridgelabz;

import java.util.ArrayList;

public class HotelManagement {
    public static ArrayList hotelList = new ArrayList<>();
    public static HotelManagement hotelManagement = new HotelManagement();
    Hotel hotel;

    public void addHotel(String name, int rates) {
        hotel = new Hotel();
        hotel.setName(name);
        hotel.setRates(rates);
        hotelList.add(hotel);
    }

    public void insertHotels() {
        hotelManagement.addHotel("sai", 500);
        hotelManagement.addHotel("savali", 700);
    }

    public static void main(String[] args) {
        System.out.println("WelCome the Hotel Management");
        hotelManagement.insertHotels();
        System.out.println(hotelList);
    }
}
