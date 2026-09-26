package com.springframework.vehicles;

public class Car implements Vehicle{

    private DiscountService discountService;// Dependency

    private String brandName; // Literal Value

    private Double maximumRetailPrice;
    public Car(){

    }

    public Car(DiscountService discountService){
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
        return "Car : " + this.discountService.getDiscountMessage();
    }


    public String getMileage(){
        return "30Km/L";
    }


}
