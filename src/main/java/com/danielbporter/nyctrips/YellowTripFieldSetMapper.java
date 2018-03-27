package com.danielbporter.nyctrips;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

public class YellowTripFieldSetMapper implements FieldSetMapper<YellowTrip> {

//    private String vendorId;
//    private String tpepPickupDateTime;
//    private String tpepDropoffDateTime;
//    private String passengerCount;
//    private String tripDistance;
//    private String ratecodeId;
//    private String storeAndFwdFlag;
//    private String pickupLocationId;
//    private String dropoffLocationId;
//    private String paymentType;
//    private String fareAmount;
//    private String extra;
//    private String mtaTax;
//    private String tipAmount;
//    private String tollsAmount;
//    private String improvementSurcharge;
//    private String totalAmount;

    @Override
    public YellowTrip mapFieldSet(FieldSet fieldSet) {
        YellowTrip yt = new YellowTrip();
        yt.setVendorId(fieldSet.readString(0));
        yt.setTpepPickupDateTime(fieldSet.readString(1));
        yt.setTpepDropoffDateTime(fieldSet.readString(2));
        yt.setPassengerCount(fieldSet.readString(3));
        yt.setTripDistance(fieldSet.readString(4));
        yt.setRatecodeId(fieldSet.readString(5));
        yt.setStoreAndFwdFlag(fieldSet.readString(6));
        yt.setPickupLocationId(fieldSet.readString(7));
        yt.setDropoffLocationId(fieldSet.readString(8));
        yt.setPaymentType(fieldSet.readString(9));
        yt.setFareAmount(fieldSet.readString(10));
        yt.setExtra(fieldSet.readString(11));
        yt.setMtaTax(fieldSet.readString(12));
        yt.setTipAmount(fieldSet.readString(13));
        yt.setTollsAmount(fieldSet.readString(14));
        yt.setImprovementSurcharge(fieldSet.readString(15));
        yt.setTotalAmount(fieldSet.readString(16));
        return yt;
    }
}
