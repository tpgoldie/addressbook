package com.tpg.ab;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by tgolding on 24/03/15.
 */
public class SortByDateOfBirth implements Comparator<AddressBookEntry>, Function<List<AddressBookEntry>, List<AddressBookEntry>> {
    @Override
    public int compare(AddressBookEntry o1, AddressBookEntry o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }

    @Override
    public List<AddressBookEntry> apply(List<AddressBookEntry> addressBookEntries) {
        return addressBookEntries.stream().sorted(this).collect(Collectors.toList());
    }
}
