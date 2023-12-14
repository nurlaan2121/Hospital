import java.time.LocalDate;

public class Pasport {
    private String name;
    private String lastName;
    private LocalDate tuulanganKun;
    private Long ID;
    private Gender gender;

    public Pasport() {
    }

    public Pasport(String name, String lastName, LocalDate tuulanganKun, Long ID, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.tuulanganKun = tuulanganKun;
        this.ID = ID;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getTuulanganKun() {
        return tuulanganKun;
    }

    public void setTuulanganKun(LocalDate tuulanganKun) {
        this.tuulanganKun = tuulanganKun;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pasport{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tuulanganKun=" + tuulanganKun +
                ", ID=" + ID +
                ", gender=" + gender +
                '}';
    }
}
