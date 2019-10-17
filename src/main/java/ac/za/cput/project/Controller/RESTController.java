package ac.za.cput.project.Controller;


import ac.za.cput.project.data.Customer;
import ac.za.cput.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RESTController {

    @Autowired
    private CustomerService customerService;

    @PutMapping("/customers/{id}")
    public ResponseEntity<?> saveResource(@RequestBody Customer customer,
                                          @PathVariable("id") String id) {
        Customer newCustomer = (Customer) customerService.saveCustomer(customer,id);
        return new ResponseEntity<>(newCustomer,HttpStatus.OK);
    }

    @PatchMapping("/customers/{id}")
    public ResponseEntity<?> updateResource(@RequestParam("email") String email, @PathVariable("id") String id){
        Customer newCustomer = (Customer) customerService.updateCustomer(email,id);
        return new ResponseEntity<>(newCustomer,HttpStatus.OK);
    }
}
