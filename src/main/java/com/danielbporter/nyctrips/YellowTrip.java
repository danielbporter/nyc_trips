package com.danielbporter.nyctrips;

public class YellowTrip {

//    -- VendorID,
//    -- tpep_pickup_datetime,
//    -- tpep_dropoff_datetime,
//    -- passenger_count,
//    -- trip_distance,
//    -- RatecodeID,
//    -- store_and_fwd_flag,
//    -- PULocationID,
//    -- DOLocationID,
//    -- payment_type,
//    -- fare_amount,
//    -- extra,
//    -- mta_tax,
//    -- tip_amount,
//    -- tolls_amount,
//    -- improvement_surcharge,
//    -- total_amount

    private String vendorId;
    private String tpepPickupDateTime;
    private String tpepDropoffDateTime;
    private String passengerCount;
    private String tripDistance;
    private String ratecodeId;
    private String storeAndFwdFlag;
    private String pickupLocationId;
    private String dropoffLocationId;
    private String paymentType;
    private String fareAmount;
    private String extra;
    private String mtaTax;
    private String tipAmount;
    private String tollsAmount;
    private String improvementSurcharge;
    private String totalAmount;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getTpepPickupDateTime() {
        return tpepPickupDateTime;
    }

    public void setTpepPickupDateTime(String tpepPickupDateTime) {
        this.tpepPickupDateTime = tpepPickupDateTime;
    }

    public String getTpepDropoffDateTime() {
        return tpepDropoffDateTime;
    }

    public void setTpepDropoffDateTime(String tpepDropoffDateTime) {
        this.tpepDropoffDateTime = tpepDropoffDateTime;
    }

    public String getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(String passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getTripDistance() {
        return tripDistance;
    }

    public void setTripDistance(String tripDistance) {
        this.tripDistance = tripDistance;
    }

    public String getRatecodeId() {
        return ratecodeId;
    }

    public void setRatecodeId(String ratecodeId) {
        this.ratecodeId = ratecodeId;
    }

    public String getStoreAndFwdFlag() {
        return storeAndFwdFlag;
    }

    public void setStoreAndFwdFlag(String storeAndFwdFlag) {
        this.storeAndFwdFlag = storeAndFwdFlag;
    }

    public String getPickupLocationId() {
        return pickupLocationId;
    }

    public void setPickupLocationId(String pickupLocationId) {
        this.pickupLocationId = pickupLocationId;
    }

    public String getDropoffLocationId() {
        return dropoffLocationId;
    }

    public void setDropoffLocationId(String dropoffLocationId) {
        this.dropoffLocationId = dropoffLocationId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(String fareAmount) {
        this.fareAmount = fareAmount;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getMtaTax() {
        return mtaTax;
    }

    public void setMtaTax(String mtaTax) {
        this.mtaTax = mtaTax;
    }

    public String getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(String tipAmount) {
        this.tipAmount = tipAmount;
    }

    public String getTollsAmount() {
        return tollsAmount;
    }

    public void setTollsAmount(String tollsAmount) {
        this.tollsAmount = tollsAmount;
    }

    public String getImprovementSurcharge() {
        return improvementSurcharge;
    }

    public void setImprovementSurcharge(String improvementSurcharge) {
        this.improvementSurcharge = improvementSurcharge;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
