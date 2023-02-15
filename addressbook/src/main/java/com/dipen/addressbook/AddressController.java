package com.dipen.addressbook;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/search")
    public List<Address> search(@RequestParam("searchTerm") String searchTerm) {
        return addressService.search(searchTerm);
    }
}
