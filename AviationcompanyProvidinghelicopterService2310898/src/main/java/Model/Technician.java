package Model;

public class Technician {
    private String name;
    private String specialization;

    public Technician(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    @Override
    public String toString() {
        return name + " (" + specialization + ")";
    }
}