package ma.elgoumri.computermanagement.service.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComputerDto {
    private String proce;
    private String ram;
    private String hardDrive;
    private Double price;
    private String macAddress;
}
