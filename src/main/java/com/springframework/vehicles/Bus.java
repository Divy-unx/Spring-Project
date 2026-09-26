package com.springframework.vehicles;

public class Bus implements Vehicle {

    private DiscountService discountService;// Dependency
    private String brandName; // Literal Value
    private Double maximumRetailPrice;

    public Bus(){

    }

    public Bus(DiscountService discountService){
        this.discountService = discountService;
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getMaximumRetailPrice() {
        return maximumRetailPrice;
    }

    public void setMaximumRetailPrice(Double maximumRetailPrice) {
        this.maximumRetailPrice = maximumRetailPrice;
    }


    @Override
    public String getDiscountMessage() {
        return "Bus : " + this.discountService.getDiscountMessage();
    }

    public String getMileage(){
        return "40Km/L";
    }



}

