package com.tpg.ab;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by tgolding on 25/03/15.
 */
public class HowManyAreGenderTest {
    private final AddressBookEntries entries = new AddressBookEntries();

    @Test
    public void howManyAreMales_AddressBookEntries_ShouldGiveACountOfAllTheMalesInTheAddressBookEntries() {
        long actual = HowManyAreGender.male(entries.allValues());
        assertThat(actual, is(4L));
    }

    @Test
    public void howManyAreFemales_AddressBookEntries_ShouldGiveACountOfAllTheFemalesInTheAddressBookEntries() {
        long actual = HowManyAreGender.female(entries.allValues());
        assertThat(actual, is(3L));
    }
}
