package ma.elgoumri.computermanagement.service;
import ma.elgoumri.computermanagement.dao.entities.Computer;
import ma.elgoumri.computermanagement.dao.repositories.ComputerRepository;
import ma.elgoumri.computermanagement.service.dto.ComputerDto;
import ma.elgoumri.computermanagement.service.mapping.ComputerMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComputerManager implements ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    @Autowired
    private ComputerMapping computerMapping;

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        if (computerRepository.existsByMacAddress(computerDto.getMacAddress())) {
            throw new IllegalArgumentException("MAC Address already exists: " + computerDto.getMacAddress());
        }
        Computer computer = computerMapping.fromDtoToEntity(computerDto);
        return computerMapping.fromEntityToDto(computerRepository.save(computer));
    }

    @Override
    public List<ComputerDto> getComputersByProce(String proce) {
        return computerRepository.findByProce(proce)
                .stream()
                .map(computerMapping::fromEntityToDto)
                .collect(Collectors.toList());
    }
}

