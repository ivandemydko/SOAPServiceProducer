package soap.repository;

import io.spring.guides.gs_producing_web_service.Address;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AddressRepository {

    private Map<Long, Address> addressList = new HashMap<>();

    @PostConstruct
    public void initData() {
        Address address1 = new Address();
        address1.setId(1);
        address1.setCity("Kiev");
        address1.setStreet("Donca");
        address1.setBuilding("34a");
        address1.setRoom("22");

        Address address2 = new Address();
        address2.setId(2);
        address2.setCity("Kiev");
        address2.setStreet("Pobedi");
        address2.setBuilding("18b");
        address2.setRoom("67");

        Address address3 = new Address();
        address3.setId(3);
        address3.setCity("Doneck");
        address3.setStreet("Schevchenko");
        address3.setBuilding("3");
        address3.setRoom("489");

        addressList.put(address1.getId(), address1);
        addressList.put(address2.getId(), address2);
        addressList.put(address3.getId(), address3);
    }

    public Address findAddress(long id) {
        return addressList.get(id);
    }
}
