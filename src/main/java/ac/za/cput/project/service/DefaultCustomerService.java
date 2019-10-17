package ac.za.cput.project.service;

import ac.za.cput.project.data.Customer;
import ac.za.cput.project.jpa.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultCustomerService implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer, String id) {

        Optional<Customer> originalCustomer = customerRepository.findById(id);
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(String email, String id) {
        Optional<Customer> originalCustomer = customerRepository.findById(id);
        Customer customer = originalCustomer.get();
        customer.setEmail(email);
        return customerRepository.save(customer);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
