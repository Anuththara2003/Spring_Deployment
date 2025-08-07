package documents.aad.javaee.test_project.spring_deployment.repo;

import documents.aad.javaee.test_project.spring_deployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{


}
