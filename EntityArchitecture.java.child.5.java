package ${PACKAGE_NAME}.service.mapper.impl;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ${PACKAGE_NAME}.service.mapper.IMapper;
import ${PACKAGE_NAME}.business.${NAME}Entity;
import ${PACKAGE_NAME}.service.dto.${NAME};

@Mapper(componentModel="spring")
public interface ${NAME}Mapper extends IMapper<${NAME}Entity, ${NAME}> {

    @Mapping(source="creationDate", target = "creationDate", dateFormat = "dd/MM/yyyy") 
    @Override
    ${NAME}Entity toEntity(${NAME} dto);

    @Mapping(source="creationDate", target = "creationDate", dateFormat = "dd/MM/yyyy")
    @Override
    ${NAME} toDTO(${NAME}Entity entity);
    
}