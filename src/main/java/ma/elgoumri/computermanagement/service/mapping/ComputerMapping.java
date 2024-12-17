package ma.elgoumri.computermanagement.service.mapping;

import ma.elgoumri.computermanagement.dao.entities.Computer;
import ma.elgoumri.computermanagement.service.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapping {
    private final ModelMapper modelMapper = new ModelMapper();

    public ComputerDto fromEntityToDto(Computer computer) {
        return modelMapper.map(computer, ComputerDto.class);
    }

    public Computer fromDtoToEntity(ComputerDto computerDto) {
        return modelMapper.map(computerDto, Computer.class);
    }
}