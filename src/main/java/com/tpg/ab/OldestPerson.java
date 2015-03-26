package com.tpg.ab;

import java.util.List;

/**
 * Created by tgolding on 26/03/15.
 */
public class OldestPerson {
    public static AddressBookEntry is(List<AddressBookEntry> addressBookEntries) {
        return new SortByDateOfBirth().apply(addressBookEntries).get(0);
    }
}
