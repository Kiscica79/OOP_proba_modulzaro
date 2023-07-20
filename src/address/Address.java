package address;

public class Address {

    private String personName;
    private String country;
    private int postalCode;
    private String town;
    private String street;
    private int houseNumber;
    private int floor;
    private int floorNumber;

    public Address(String personname, String country, int postalCode, String town, String street,
                         int houseNumber, int floor, int floorNumber) {
        this.personName = personname;
        this.country = country;
        this.postalCode = postalCode;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.floor = floor;
        this.floorNumber = floorNumber;
    }



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", postalCode=" + postalCode +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", floor=" + floor +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
