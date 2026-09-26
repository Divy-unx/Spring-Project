package com.springframework.vehicles;

public class FestivalDiscountService implements DiscountService{
    @Override
    public String getDiscountMessage() {
        return "Please contact our customer care team !";
    }

}
