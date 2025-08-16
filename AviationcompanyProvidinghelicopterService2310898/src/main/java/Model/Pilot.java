package Model;

public class Pilot {
    private String name;
    private String licenseId;

    public Pilot(String name, String licenseId) {
        this.name = name;
        this.licenseId = licenseId;
    }

    public String getName() { return name; }
    public String getLicenseId() { return licenseId; }
}
