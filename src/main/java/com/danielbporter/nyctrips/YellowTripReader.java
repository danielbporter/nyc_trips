package com.danielbporter.nyctrips;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class YellowTripReader implements ItemReader<YellowTrip> {


    @Override
    public YellowTrip read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return null;
    }
}
