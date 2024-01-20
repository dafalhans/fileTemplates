#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
//import ${PACKAGE_NAME}.service.mapper.IMapper;
import ${PACKAGE_NAME}.business.${NAME}Entity;
import ${PACKAGE_NAME}.service.dto.${NAME};

@Mapper(componentModel="spring")
public interface ${NAME}Mapper extends IMapper<${NAME}Entity, ${NAME}> {

 //   @Mapping(source = "creationDate", target = "creationDate", ignore = true)
 //   @Mapping(source = "modificationDate", target = "modificationDate", ignore = true) 
    @Mapping(source = "creationDate", target = "creationDate")
    @Mapping(source = "modificationDate", target = "modificationDate")
    @Override
    ${NAME}Entity toEntity(${NAME} dto);

 //   @Mapping(source = "creationDate", target = "creationDate", ignore = true)
 //   @Mapping(source = "modificationDate", target = "modificationDate", ignore = true) 
    @Mapping(source = "creationDate", target = "creationDate")
    @Mapping(source = "modificationDate", target = "modificationDate")
    @Override
    ${NAME} toDTO(${NAME}Entity entity);
    
}