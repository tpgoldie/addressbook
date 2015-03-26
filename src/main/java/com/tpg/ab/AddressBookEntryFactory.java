package com.tpg.ab;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

/**
 * Created by tgolding on 24/03/15.
 */
public class AddressBookEntryFactory {
    private static final int Three = 3;

    public Optional<AddressBookEntry> build(String line) {
        if ((line == null) || (line.isEmpty())) { return empty(); }

        String[] tokens = line.split(",");
        if (tokens.length != Three) { return empty(); }

        return of(new AddressBookEntry(tokens[0].trim(), tokens[1].trim(), tokens[2].trim()));
    }
}
