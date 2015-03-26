package com.tpg.ab;

import org.joda.time.*;

import java.util.function.BiFunction;

/**
 * Created by tgolding on 26/03/15.
 */
public class DaysDifference implements BiFunction<AddressBookEntry, AddressBookEntry, Integer> {
    @Override
    public Integer apply(AddressBookEntry entryOne, AddressBookEntry entryTwo) {
        DateTime dobOne = entryOne.getDateOfBirth();
        DateTime dobTwo = entryTwo.getDateOfBirth();

        if (dobOne.isAfter(dobTwo)) {
            return Days.daysBetween(dobTwo.toLocalDate(), dobOne.toLocalDate()).getDays();
        }

        return Days.daysBetween(dobOne.toLocalDate(), dobTwo.toLocalDate()).getDays();
    }
}
