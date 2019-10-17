package ac.za.cput.project.Controller;

import ac.za.cput.project.data.Customer;
import ac.za.cput.project.data.Registration;
import ac.za.cput.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/registration")
    public ResponseEntity<Customer> register(@RequestBody Registration registration){
        Customer  customer= (Customer) customerService.saveCustomer(mapCustomerData(registration));
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }

    protected Customer mapCustomerData(Registration registration){
        Customer  customer = new Customer(registration.getFirstName(),registration.getLastName(),registration.getEmail());
        customer.setAge(registration.getAge());
        return customer;
    }
}
