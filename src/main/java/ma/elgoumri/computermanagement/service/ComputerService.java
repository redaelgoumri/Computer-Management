package ma.elgoumri.computermanagement.service;

import ma.elgoumri.computermanagement.service.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    ComputerDto saveComputer(ComputerDto computerDto);
    List<ComputerDto> getComputersByProce(String proce);
}

