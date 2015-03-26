package com.tpg.ab;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tgolding on 25/03/15.
 */
public class AddressBookEntries {
    private final DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yy");

    private final AddressBookEntry tedRogers = new AddressBookEntry("Ted Rodgers", "Male", "14/03/78");
    private final AddressBookEntry billMcKnight = new AddressBookEntry("Bill McKnight", "Male", "16/03/77");
    private final AddressBookEntry janeSmith = new AddressBookEntry("Jane Smith", "Female", "18/04/78");
    private final AddressBookEntry gemmaLane = new AddressBookEntry("Gemma Lane", "Female", "20/11/91");
    private final AddressBookEntry kathyBridges = new AddressBookEntry("Kathy Bridges", "Female", "14/12/81");
    private final AddressBookEntry billMurray = new AddressBookEntry("Bill Murray", "Male", "16/05/47");
    private final AddressBookEntry tonyStarks = new AddressBookEntry("Tony Starks", "Male", "16/07/69");

    public DateTimeFormatter dateTimeFormatter() {
        return formatter;
    }

    public AddressBookEntry billMcKnight() {
        return billMcKnight;
    }

    public AddressBookEntry janeSmith() { return janeSmith; }

    public AddressBookEntry tedRogers() { return tedRogers; }

    public AddressBookEntry gemmaLane() {
        return gemmaLane;
    }

    public AddressBookEntry kathyBridges() {
        return kathyBridges;
    }

    public AddressBookEntry billMurray() {
        return billMurray;
    }

    public AddressBookEntry tonyStarks() {
        return tonyStarks;
    }

    public List<AddressBookEntry> allValues() {
        return Arrays.asList(tonyStarks(), billMcKnight(), gemmaLane(), billMurray(), kathyBridges(), tedRogers(), janeSmith());
    }
}
