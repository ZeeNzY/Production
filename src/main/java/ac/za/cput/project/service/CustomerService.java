package ac.za.cput.project.service;


import ac.za.cput.project.data.Customer;

public interface CustomerService<T,id> {

    public T saveCustomer(Customer customer, String id);
    public T updateCustomer(String email, String id);
    public T saveCustomer(Customer customer);
}
