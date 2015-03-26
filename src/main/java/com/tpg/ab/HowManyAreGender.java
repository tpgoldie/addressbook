package com.tpg.ab;

import java.util.List;
import java.util.function.Function;

import static com.tpg.ab.Gender.Female;
import static com.tpg.ab.Gender.Male;

/**
 * Created by tgolding on 25/03/15.
 */
public class HowManyAreGender implements Function<List<AddressBookEntry>, Long> {
    public static long male(List<AddressBookEntry> entries) {
        return new HowManyAreGender(Male).apply(entries);
    }

    public static long female(List<AddressBookEntry> entries) {
        return new HowManyAreGender(Female).apply(entries);
    }

    private final Gender gender;

    private HowManyAreGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public Long apply(List<AddressBookEntry> addressBookEntries) {
        return addressBookEntries.stream().filter(entry -> matchesGender(entry)).count();
    }

    private boolean matchesGender(AddressBookEntry entry) {
        return gender.equals(entry.getGender());
    }
}
