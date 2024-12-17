package ma.elgoumri.computermanagement.dao.repositories;

import ma.elgoumri.computermanagement.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findByProce(String proce);
    boolean existsByMacAddress(String macAddress);
}