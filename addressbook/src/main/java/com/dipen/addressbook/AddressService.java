package com.dipen.addressbook;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private List<Address> addresses;

    public AddressService() {
        addresses = new ArrayList<>();
        csvFileReader fileReader = new csvFileReader();
		addresses.addAll(fileReader.readCSV());
        // addresses.add(new Address("Dave", "Smith", "123 main st.", "seattle", "wa", "43"));
        // addresses.add(new Address("Alice", "Smith", "123 Main St.", "Seattle", "WA", "45"));
        // addresses.add(new Address("Bob", "Williams", "234 2nd Ave.", "Tacoma", "WA", "26"));
        // addresses.add(new Address("Carol", "Johnson", "234 2nd Ave", "Seattle", "WA", "67"));
        // addresses.add(new Address("Tom", "Bombadillo", "1212 Maple Street", "Florida", "GA", "520"));
    }

    public List<Address> search(String searchTerm) {
        return addresses.stream().filter(address ->
            address.getFirstName().toLowerCase().contains(searchTerm.toLowerCase()) ||
            address.getLastName().toLowerCase().contains(searchTerm.toLowerCase()) ||
            address.getAddress().toLowerCase().contains(searchTerm.toLowerCase()) ||
            address.getCity().toLowerCase().contains(searchTerm.toLowerCase()) ||
            address.getState().toLowerCase().contains(searchTerm.toLowerCase()) ||
            address.getPincode().toLowerCase().contains(searchTerm.toLowerCase())
        ).collect(Collectors.toList());
    }

}