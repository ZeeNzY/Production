package ac.za.cput.project;

import ac.za.cput.project.data.Customer;
import ac.za.cput.project.jpa.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

//@Component
public class AppConfig {

   /* @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    public void init(){

        customerRepository.save(new Customer("Shekher", "Kumar","abc@email.com"));
        customerRepository.save(new Customer("Robert", "Hickle","abc1@email.com"));
        customerRepository.save(new Customer("David", "Palmer","abc3@email.com"));
        customerRepository.save(new Customer("Michelle", "Dessler", "abc@email.com"));

        Iterable<Customer> custmomer = customerRepository.findAll();
        System.out.println("*******************************");
        custmomer.forEach((Customer cust)->{
            System.out.println(cust.getId());
        });


    }*/
}
