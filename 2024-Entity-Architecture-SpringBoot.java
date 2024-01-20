#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#set( $CamelCaseName = "$NAME.substring(0,1).toLowerCase()$NAME.substring(1)" )

import lombok.Data;
import jakarta.persistence.Entity;

@Entity
@Data
public class ${NAME}Entity extends BaseEntity<${PK_TYPE}>{

//
//   @Id
//    @GeneratedValue
//    @Column(name = "${CamelCaseName}_id")
//    private Long id;

//    @EmbeddedId
//    private PersonPK pk;

//    @Version
//    private int version;

//    private String name;
//   private int age;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "Vrijedag", length = 4)
//    private Weekday freeDay;

//    @Transient
//    private int tansientdata;

//    @Embedded
//    private Address address;

}
