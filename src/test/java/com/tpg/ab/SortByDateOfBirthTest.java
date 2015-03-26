package com.tpg.ab;

import org.junit.Test;

import java.util.List;

import static com.tpg.ab.AddressEntryAssert.assertThatAddressEntry;

/**
 * Created by tgolding on 26/03/15.
 */
public class SortByDateOfBirthTest {
    private AddressBookEntries entries = new AddressBookEntries();

    private SortByDateOfBirth sorter = new SortByDateOfBirth();

    @Test
    public void sortByDateOfBirth_AddressBookEntries_ShouldSortEntriesFromOldestToYoungest() {
        List<AddressBookEntry> actual = sorter.apply(entries.allValues());

        assertThatAddressEntry(actual.get(0)).hasName("Bill Murray");
        assertThatAddressEntry(actual.get(1)).hasName("Tony Starks");
        assertThatAddressEntry(actual.get(2)).hasName("Bill McKnight");
        assertThatAddressEntry(actual.get(3)).hasName("Ted Rodgers");
        assertThatAddressEntry(actual.get(4)).hasName("Jane Smith");
        assertThatAddressEntry(actual.get(5)).hasName("Kathy Bridges");
        assertThatAddressEntry(actual.get(6)).hasName("Gemma Lane");
    }
}
