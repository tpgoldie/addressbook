package com.tpg.ab;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by tgolding on 26/03/15.
 */
public class DaysDifferenceTest {
    private final AddressBookEntries entries = new AddressBookEntries();

    private DaysDifference daysDifference = new DaysDifference();

    @Test
    public void daysDifferenceLessThanYear_TwoAddressBookEntries_ShouldGiveTheNumberOfDaysBetweenTheDatesOfBirthOfEntries() {
        int actual = daysDifference.apply(entries.billMcKnight(), entries.tedRogers());
        assertThat(actual, is(363));
    }

    @Test
    public void daysDifferenceMoreThanYear_TwoAddressBookEntries_ShouldGiveTheNumberOfDaysBetweenTheDatesOfBirthOfEntries() {
        int actual = daysDifference.apply(entries.billMcKnight(), entries.janeSmith());
        assertThat(actual, is(398));
    }
}
