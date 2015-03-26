package com.tpg.ab;

/**
 * Created by tgolding on 24/03/15.
 */
public enum Gender {
    Female, Male, Unknown;

    public static Gender findByValue(String value) {
        if (Male.name().equalsIgnoreCase(value)) { return Male; }
        if (Female.name().equalsIgnoreCase(value)) { return Female; }

        return Unknown;
    }
}
