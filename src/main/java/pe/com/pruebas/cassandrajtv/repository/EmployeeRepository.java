package pe.com.pruebas.cassandrajtv.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.com.pruebas.cassandrajtv.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

	List<Employee> findByFirstName(String firstName);
}
