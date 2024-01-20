#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set( $CamelCaseName = "$NAME.substring(0,1).toLowerCase()$NAME.substring(1)" )

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ${PACKAGE_NAME}.business.${NAME}Entity;
import ${PACKAGE_NAME}.business.repository.impl.${NAME}Repository;
import ${PACKAGE_NAME}.service.mapper.impl.${NAME}Mapper;
import ${PACKAGE_NAME}.service.dto.${NAME};

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ${NAME}Service {

    private final ${NAME}Repository repository;
    private final ${NAME}Mapper ${CamelCaseName}Mapper;
    
    public ${NAME} create(${NAME} dto) {
        return ${CamelCaseName}Mapper.toDTO(repository.save(${CamelCaseName}Mapper.toEntity(dto)));
    }

    public List<${NAME}> getAll() {
        return ${CamelCaseName}Mapper.toDTO(repository.findAll());
    }
    
    public ${NAME} getById(${PK_TYPE} id) {
        Optional<${NAME}Entity> found = repository.findById(id);
        if(found.isPresent()){
            return ${CamelCaseName}Mapper.toDTO(found.get());
        }
        return null;
    }

    public ${NAME} update(${NAME} dto) {
        return ${CamelCaseName}Mapper.toDTO(repository.save(${CamelCaseName}Mapper.toEntity(dto)));
    }

    public void deleteById(${PK_TYPE} id) {
        repository.deleteById(id);
    }



}