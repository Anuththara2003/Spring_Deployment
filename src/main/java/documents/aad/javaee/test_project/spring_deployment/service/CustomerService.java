package documents.aad.javaee.test_project.spring_deployment.service;

import documents.aad.javaee.test_project.spring_deployment.entity.Customer;
import documents.aad.javaee.test_project.spring_deployment.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public List<Customer> getCustomer() {

        return customerRepo.findAll();
    }
    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);
}

}
