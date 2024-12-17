package ma.elgoumri.computermanagement;

import ma.elgoumri.computermanagement.dao.entities.Computer;
import ma.elgoumri.computermanagement.dao.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ComputerManagementApplication {
    @Autowired
    private ComputerRepository computerRepository;

    public static void main(String[] args) {
        SpringApplication.run(ComputerManagementApplication.class, args);
    }

        @Bean
        CommandLineRunner start() {
            return args -> {
                List<Computer> computers = List.of(
                        Computer.builder()
                                .proce("Intel i5")
                                .ram("8GB")
                                .hardDrive("256GB SSD")
                                .price(700.0)
                                .macAddress("00:1A:2B:3C:4D:5E")
                                .build(),
                        Computer.builder()
                                .proce("Intel i7")
                                .ram("16GB")
                                .hardDrive("512GB SSD")
                                .price(1200.0)
                                .macAddress("00:1A:2B:3C:4D:5F")
                                .build(),
                        Computer.builder()
                                .proce("AMD Ryzen 5")
                                .ram("8GB")
                                .hardDrive("1TB HDD")
                                .price(800.0)
                                .macAddress("00:1A:2B:3C:4D:6A")
                                .build(),
                        Computer.builder()
                                .proce("Apple M1")
                                .ram("16GB")
                                .hardDrive("512GB SSD")
                                .price(1500.0)
                                .macAddress("00:1A:2B:3C:4D:6B")
                                .build()
                );
                computerRepository.saveAll(computers);
            };
        }
}


