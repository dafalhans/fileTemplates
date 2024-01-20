#parse("Hans Header.java")

package ${PACKAGE_NAME}.business;


import java.io.Serializable;
import lombok.Data;
import java.time.LocalDate;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class BaseEntity<P extends Serializable> {

    @Id
    private P id;
    private LocalDate creationDate;
    
}