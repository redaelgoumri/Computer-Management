package ma.elgoumri.computermanagement.web;
import ma.elgoumri.computermanagement.service.ComputerService;
import ma.elgoumri.computermanagement.service.dto.ComputerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQLController {

    @Autowired
    private ComputerService computerService;

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computerDto) {
        return computerService.saveComputer(computerDto);
    }

    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce) {
        return computerService.getComputersByProce(proce);
    }
}

