package com.tpg.ab;

import org.assertj.core.api.AbstractAssert;
import org.joda.time.DateTime;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by tgolding on 24/03/15.
 */
public class AddressEntryAssert extends AbstractAssert<AddressEntryAssert, AddressBookEntry> {
    public static AddressEntryAssert assertThatAddressEntry(AddressBookEntry actual) {
        return new AddressEntryAssert(actual);
    }

    protected AddressEntryAssert(AddressBookEntry actual) {
        super(actual, AddressEntryAssert.class);
    }

    public AddressEntryAssert hasName(String value) {
        isNotNull();
        assertThat(actual.getName())
            .overridingErrorMessage("Expected name to be %s but was %s", value, actual.getName())
                .isEqualTo(value);

        return this;
    }

    public AddressEntryAssert hasGender(Gender value) {
        isNotNull();
        assertThat(actual.getGender())
            .overridingErrorMessage("Expected gender to be %s but was %s", value, actual.getGender())
                .isEqualTo(value);

        return this;
    }

    public AddressEntryAssert hasDateOfBirth(DateTime value) {
        isNotNull();
        assertThat(actual.getDateOfBirth())
            .overridingErrorMessage("Expected date of birth to be %s but was %s", value.toString(), actual.getDateOfBirth().toString())
                .isEqualTo(value);

        return this;
    }
}
