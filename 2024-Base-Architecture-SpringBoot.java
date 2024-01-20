package ${PACKAGE_NAME}.business;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
public class BaseEntity<P extends Serializable> {

    @Id
    private P id;
    private String name;
    @Column(updatable = false)
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;

    @PrePersist
    public void prePersist() {
        creationDate = LocalDateTime.now();
        modificationDate = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        modificationDate = LocalDateTime.now();
    }

}