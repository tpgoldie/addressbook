package com.tpg.ab;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by tgolding on 26/03/15.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
    AddressBookTest.class,
    AddressBookEntryFactoryTest.class,
    DaysDifferenceTest.class,
    OldestPersonTest.class,
    HowManyAreGenderTest.class,
    SortByDateOfBirthTest.class
})
public class AddressBookTestSuite {
}
