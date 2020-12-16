package nl.fontys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassportParserTests {
    @Test
    public void Can_parse_a_valid_passport() {
        // arrange
        var passportString = """
ecl:gry pid:860033327 eyr:2020 hcl:#fffffd
byr:1937 iyr:2017 cid:147 hgt:183cm""";
        var parser = new PassportParser();

        // act
        var result = parser.parse(passportString);

        // assert
        assertEquals(new Passport("gry", 860033327, 2020, "#fffffd", 1937, 2017, 147, "183cm"), result);
    }
}
