package ${PACKAGE_NAME}.service.service;

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
    private final ${NAME}Mapper mapper;
    
    public void create(${NAME} dto) {
        repository.save(mapper.toEntity(dto));
    }

    public List<${NAME}> getAll() {
        return mapper.toDTO(repository.findAll());
    }
    
    public ${NAME} getById(${PK_TYPE} id) {
        Optional<${NAME}Entity> found = repository.findById(id);
        if(found.isPresent()){
            return mapper.toDTO(found.get());
        }
        return null;
    }

    public ${NAME} update(${NAME} dto) {
        return mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }

    public void delete(${PK_TYPE} id) {
        repository.deleteById(id);
    }



}