package com.tpg.ab;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by tgolding on 24/03/15.
 */
public class AddressBook {
    private final List<AddressBookEntry> addresses = new ArrayList<AddressBookEntry>();

    public AddressBook(List<AddressBookEntry> entries) {
        addresses.addAll(entries);
    }

    public void addEntry(AddressBookEntry entry) {
        addresses.add(entry);
    }

    public long countByGender(Gender gender) {
        switch(gender) {
            case Male:
                return HowManyAreGender.male(addresses);

            case Female:
                return HowManyAreGender.female(addresses);
        }

        return BigDecimal.ZERO.intValue();
    }

    public AddressBookEntry oldestPerson() {
        return OldestPerson.is(addresses);
    }

    public int daysDifference(String name1, String name2) {
        Optional<AddressBookEntry> entry1 = addresses.stream().filter(entry -> entry.getName().equalsIgnoreCase(name1)).findFirst();
        Optional<AddressBookEntry> entry2 = addresses.stream().filter(entry -> entry.getName().equalsIgnoreCase(name2)).findFirst();

        if (entry1.isPresent() && entry2.isPresent()) {
            return new DaysDifference().apply(entry1.get(), entry2.get());
        }

        return -1;
    }
}
