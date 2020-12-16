package nl.fontys;

import java.util.Objects;

import static java.lang.String.valueOf;

public class Passport {
    private final String eyeColor;
    private final int passportId;
    private final int expiryYear;
    private final String hairColor;
    private final int birthYear;
    private final int issuerYear;
    private final int countryId;
    private final String height;

    public Passport(String eyeColor, int passportId, int expiryYear, String hairColor, int birthYear, int issuerYear, int countryId, String height) {
        this.eyeColor = eyeColor;
        this.passportId = passportId;
        this.expiryYear = expiryYear;
        this.hairColor = hairColor;
        this.birthYear = birthYear;
        this.issuerYear = issuerYear;
        this.countryId = countryId;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportId == passport.passportId &&
                expiryYear == passport.expiryYear &&
                birthYear == passport.birthYear &&
                issuerYear == passport.issuerYear &&
                countryId == passport.countryId &&
                eyeColor.equals(passport.eyeColor) &&
                hairColor.equals(passport.hairColor) &&
                height.equals(passport.height);
    }

    @Override
    public String toString() {
        return "Passport 123 met ID:" + valueOf(this.passportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyeColor, passportId, expiryYear, hairColor, birthYear, issuerYear, countryId, height);
    }
}
