package com.tpg.ab;

import org.junit.Test;

import static com.tpg.ab.AddressEntryAssert.assertThatAddressEntry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by tgolding on 24/03/15.
 */
public class AddressBookTest {
    private final AddressBookEntries entries = new AddressBookEntries();

    private AddressBook addressBook = new AddressBook(entries.allValues());

    @Test
    public void countMales_AddressBook_ShouldGiveCountOfMaleEntries() {
        long actual = addressBook.countByGender(Gender.Male);
        assertThat(actual, is(4L));
    }

    @Test
    public void countFemales_AddressBook_ShouldGiveCountOfFemaleEntries() {
        long actual = addressBook.countByGender(Gender.Female);
        assertThat(actual, is(3L));
    }

    @Test
    public void oldestPerson_AddressBook_ShouldGiveEntryOfOldestPerson() {
        AddressBookEntry actual = addressBook.oldestPerson();

        assertThatAddressEntry(actual).hasName("Bill Murray");
    }

    @Test
    public void daysDifference_TwoAddressBookEntries_ShouldGiveDaysDifferenceBetweenTheEntries() {
        int actual = addressBook.daysDifference(entries.billMcKnight().getName(), entries.janeSmith().getName());
        assertThat(actual, is(398));
    }
}
