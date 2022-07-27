package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HotelManagement {
    public static ArrayList hotelList = new ArrayList<>();
    public static HotelManagement hotelManagement = new HotelManagement();
    Hotel hotel;

    public void addHotel(String name, int weekDayRate,int weekEndRate) {
        hotel = new Hotel();
        hotel.setName(name);
        hotel.setWeekDayRate(weekDayRate);
        hotel.setWeekEndRate(weekEndRate);
        hotelList.add(hotel);
    }

    public void insertHotels() {
        hotelManagement.addHotel("sai", 500,700);
        hotelManagement.addHotel("savali", 700,600);
        hotelManagement.addHotel("Taj",1200,1500);
    }

    public static void main(String[] args) {
        System.out.println("WelCome the Hotel Management");
        hotelManagement.insertHotels();
        System.out.println(hotelList);
        LocalDate startDate = LocalDate.of(2022, 7, 22);
        LocalDate endDate = LocalDate.of(2022, 7, 23);
        System.out.println("Cheapest Rate of WeekDay hotel is: \n" + hotelManagement.cheapestHotelWeekDay());
        System.out.println("Cheapest Rate of WeekEnd hotel is: \n" + hotelManagement.cheapestHotelWeekEnd());
    }

    private Optional cheapestHotelWeekEnd() {
        return hotelList.stream().min(Comparator.comparing(Hotel::getWeekEndRate));
    }

    private Optional cheapestHotelWeekDay() {
        return hotelList.stream().min(Comparator.comparing(Hotel::getWeekDayRate));
    }
}
