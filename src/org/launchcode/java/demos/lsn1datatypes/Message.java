package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "WoW!";
        } else if (lang.equals("fr")) {
            return "Howdy!";
        } else {
            return "Hello, World!";
        }
    }
}
