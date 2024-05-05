package ${PACKAGE_NAME}.service.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Base {

    private String id;
    private String name;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
}