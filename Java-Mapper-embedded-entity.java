#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.service.mapper;#end

#set( $CamelCaseName = "$NAME.substring(0,1).toLowerCase()$NAME.substring(1)" )

import ${PACKAGE_NAME}.business.domain.${NAME}Entity;
import ${PACKAGE_NAME}.service.dto.${NAME};
import ${PACKAGE_NAME}.util.${NAME}Mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

//HANS: Use this when using a Entity2 in Entity1, while String(from Entity2) inside a DTO(from Entity1)
//@Mapper(componentModel = "spring", uses = DTO2Mapper.class)
//public interface ${NAME}Mapper extends IMapper<${NAME}, ${NAME}Entity> {

//HANS: Mappings to Entity2 (used in Entity1)
//    @Mapping(source = "firstName", target = "contactInfoEntity.firstName")
//    @Mapping(source = "lastName", target = "contactInfoEntity.lastName")
//    @Mapping(source = "address", target = "contactInfoEntity.address")
//    ${NAME}Entity toEntity(${NAME} $CamelCaseName);

//    @Mapping(source = "contactInfoEntity.firstName", target = "firstName")
//    @Mapping(source = "contactInfoEntity.lastName", target = "lastName")
//    @Mapping(source = "contactInfoEntity.address", target = "address")
//    ${NAME} toDto(${NAME} $CamelCaseName);
//}

@Mapper(componentModel = "spring")
public interface ${NAME}Mapper extends IMapper<${NAME}, ${NAME}Entity> {

    ${NAME}Entity toEntity(${NAME} $CamelCaseName);

    ${NAME} toDto(${NAME} $CamelCaseName);
}