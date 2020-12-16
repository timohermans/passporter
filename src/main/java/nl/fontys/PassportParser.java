package nl.fontys;

import java.util.HashMap;

public class PassportParser {
    public Passport parse(String passportString) {
        // een willekeurige comment
        HashMap<String, String> valuesPerKey = extractPassportValuesPerKey(passportString);

        return new Passport(
                valuesPerKey.get("ecl"),
                Integer.parseInt(valuesPerKey.get("pid")),
                Integer.parseInt(valuesPerKey.get("eyr")),
                valuesPerKey.get("hcl"),
                Integer.parseInt(valuesPerKey.get("byr")),
                Integer.parseInt(valuesPerKey.get("iyr")),
                Integer.parseInt(valuesPerKey.get("cid")),
                valuesPerKey.get("hgt")
        );
    }

    private HashMap<String, String> extractPassportValuesPerKey(String passportString) {
        var valuesPerKey = new HashMap<String, String>();
        var splits = passportString.split("[\r\n ]");

        for (var split : splits) {
            var valueSplit = split.split(":");
            valuesPerKey.put(valueSplit[0], valueSplit[1]);
        }
        return valuesPerKey;
    }
}
