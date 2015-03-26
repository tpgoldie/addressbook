package com.tpg.ab;

import org.junit.Test;

import static com.tpg.ab.AddressEntryAssert.assertThatAddressEntry;

/**
 * Created by tgolding on 26/03/15.
 */
public class OldestPersonTest {
    private final AddressBookEntries entries = new AddressBookEntries();

    @Test
    public void findOldestPerson_AddressBookEntries_ShouldFindOldestPerson() {
        AddressBookEntry actual = OldestPerson.is(entries.allValues());

        assertThatAddressEntry(actual).hasName("Bill Murray");
    }
}
