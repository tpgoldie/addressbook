package com.tpg.ab;

import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import java.util.Optional;

import static com.tpg.ab.AddressEntryAssert.assertThatAddressEntry;
import static com.tpg.ab.Gender.Female;
import static com.tpg.ab.Gender.Male;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by tgolding on 24/03/15.
 */
public class AddressBookEntryFactoryTest {
    private static final DateTimeFormatter Formatter = new AddressBookEntries().dateTimeFormatter();

    private AddressBookEntryFactory factory = new AddressBookEntryFactory();

    @Test
    public void buildAddressEntryForMaleFromString_AddressEntryLine_ShouldCreateAddressEntry() {
        String line = "Bill McKnight, Male, 16/03/77";
        AddressBookEntry actual = factory.build(line).get();

        assertThatAddressEntry(actual)
            .hasName("Bill McKnight")
            .hasGender(Male)
            .hasDateOfBirth(Formatter.parseDateTime("16/03/77"));
    }

    @Test
    public void buildAddressEntryForFemaleFromString_AddressEntryLine_ShouldCreateAddressEntry() {
        String line = "Gemma Lane, Female, 20/11/91";
        AddressBookEntry actual = factory.build(line).get();

        assertThatAddressEntry(actual)
            .hasName("Gemma Lane")
            .hasGender(Female)
            .hasDateOfBirth(Formatter.parseDateTime("20/11/91"));
    }

    @Test
    public void buildAddressEntryFromEmptyString_EmptyString_ShouldReturnEmptyOption() {
        Optional<AddressBookEntry> actual = factory.build("");
        assertThat(actual.isPresent(), is(false));
    }

    @Test
    public void buildAddressEntryFromInvalidString_InvalidString_ShouldReturnEmptyOption() {
        Optional<AddressBookEntry> actual = factory.build("Bill McKnight,Male");
        assertThat(actual.isPresent(), is(false));
    }
}
