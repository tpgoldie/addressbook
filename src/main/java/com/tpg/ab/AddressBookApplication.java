package com.tpg.ab;

import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tgolding on 26/03/15.
 */
public class AddressBookApplication {
    private static final Logger Log = Logger.getLogger(AddressBookApplication.class);

    public static void main(String[] args) throws FileNotFoundException {
        AddressFileReader fileReader = new AddressFileReader("/AddressBook.txt");

        AddressBookEntryFactory factory = new AddressBookEntryFactory();

        List<String> lines = fileReader.readLines();

        List<AddressBookEntry> entries = lines.stream()
            .map(line -> factory.build(line))
                .filter(e -> e.isPresent())
                    .map(e -> e.get())
                        .collect(Collectors.toList());

        AddressBook addressBook = new AddressBook(entries);

        Log.info(String.format("There are %d males.", addressBook.countByGender(Gender.Male)));
        Log.info(String.format("%s is the oldest person.", addressBook.oldestPerson().getName()));

        String name1 = "Bill McKnight";
        String name2 = "Paul Robinson";
        Log.info(String.format("%s is %d days older than %s.", name1, addressBook.daysDifference(name1, name2), name2));
    }
}
