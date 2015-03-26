package com.tpg.ab;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import static com.tpg.ab.Gender.findByValue;

/**
 * Created by tgolding on 24/03/15.
 */
public class AddressBookEntry {
    private static final DateTimeFormatter Formatter = DateTimeFormat.forPattern("dd/MM/yy");

    private String name;
    private Gender gender;
    private DateTime dateOfBirth;

    public AddressBookEntry(String name, String gender, String dob) {
        this.name = name;
        this.gender = findByValue(gender);
        this.dateOfBirth = Formatter.parseDateTime(dob);
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AddressBookEntry)) { return false; }

        AddressBookEntry that = (AddressBookEntry) obj;

        return new EqualsBuilder()
            .append(this.name, that.name)
            .append(this.gender, that.gender)
            .append(this.dateOfBirth, that.dateOfBirth)
            .isEquals();
    }
}
