package address;

import java.util.HashMap;
import java.util.Map;

public class Address extends PersonAddress {

    private Map<PersonAddress, Integer> addresses = new HashMap<>();

    public Address(String personName, String country, int postalCode, String town, String street, int houseNumber, int floor,
                   int floorNumber, Map<PersonAddress, Integer> addresses) {
        super(personName, country, postalCode, town, street, houseNumber, floor, floorNumber);
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
        if (addresses.containsKey(address)) {
            int eddigCim = addresses.get(address);
            addresses.put(address, eddigCim + 1);
        }
        System.out.println(addresses.put(address, 1));
    }


    public void displayAddress() {
        System.out.println("The books in the bookstore : ");
        for (Map.Entry<PersonAddress, Integer> entry : addresses.entrySet()) {
            System.out.println("Address " + entry.getKey() + " quantity : " + entry.getValue());
        }
    }

    public PersonAddress findAddress(String personName) throws AddressNotFound {
        for (PersonAddress address : addresses.keySet()) {
            if (address.getPersonName().equals(personName)) {
                return address;
            }
        }
        throw new AddressNotFound("This address is not found");
    }

    public void removeAddress(String personName, int quantity) throws AddressNotFound {
        PersonAddress address = findAddress(personName);
        if (!addresses.containsKey(personName)) {
            throw new AddressNotFound("Nincs ilyen cím");
        }
        addresses.put(address, addresses.get(address)-quantity);

    }



// TODO Szeretném tárolni alkalmazottak adatait, erre létrehozok egy osztályt.
//  Ebben az osztályban cím(ek)et is szeretnék eltárolni az alkalmazottakhoz,
//  méghozzá részletesen: pl. ország, irányítószám, utca, emelet, stb. A címekből több is lehet egy alkalmazotthoz.
// TODO Csináld meg a kigondolt osztálystruktúrát, lásd el a szükséges metódusokkal!
//  Ügyelj arra, hogy betartsd az OOP koncepcióit, az osztályod zárt legyen és
//  csak metódusokkal tudj címeket hozzáadni ill. a címeket lekérdezni!
//  Az alkalmazottak többi adatával nem kell foglalkoznod, elég csak a címek nyilvántartását megvalósítani.


}
