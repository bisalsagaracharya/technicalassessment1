package Soccer;

import java.time.LocalDate;
public class Guest {
    private String name;
    private LocalDate dob;
    private Country country;
    private Language language;
    private Hobby hobby;

    private long age;

    public Guest(String name, LocalDate dob, Country country, Language language, Hobby hobby) {
        this.name = name;
        this.dob = dob;
        this.country = country;
        this.language = language;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public long getAge() {
        return age;
    }
    public void setAge(long age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", country=" + country +
                ", language=" + language +
                ", hobby=" + hobby +
                ", age=" + age +
                '}';
    }
}
