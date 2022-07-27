package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

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
        LocalDate startDate = LocalDate.of(2022,7,22);
        LocalDate endDate = LocalDate.of(2022,7,23);
        System.out.println("Cheapest hotel is: \n"+hotelManagement.cheapestHotel());
    }

    private Optional cheapestHotel() {
       return hotelList.stream().min(Comparator.comparing(Hotel::getRates));
    }
}
