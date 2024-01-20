#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#set( $CamelCaseNamePlural = "$NAME.substring(0,1).toLowerCase()$NAME.substring(1)s" )

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ${PACKAGE_NAME}.service.service.${NAME}Service;
import ${PACKAGE_NAME}.service.dto.${NAME};

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ${NAME}Resource {

    private final Logger logger = LoggerFactory.getLogger(${NAME}Resource.class);

    private final ${NAME}Service service;
    
     @GetMapping("/$CamelCaseNamePlural/health")
    public ResponseEntity<String> up(){
        return ResponseEntity.ok("${NAME} Resource up and running");
    }

    @GetMapping("/$CamelCaseNamePlural")
    public ResponseEntity<List<${NAME}>> getAll(){
        logger.debug("Get all $CamelCaseNamePlural ");
        List<${NAME}> dtos = service.getAll();
        return ResponseEntity.ok(dtos);
    }
    
    @GetMapping("/$CamelCaseNamePlural/{id}")
    public ResponseEntity<${NAME}> getById(@PathVariable ${PK_TYPE} id) {
        logger.debug("Get ${NAME} by id: {}", id);
        ${NAME} dto = service.getById(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping ("/$CamelCaseNamePlural")
    public ResponseEntity<String> create(@RequestBody ${NAME} dto){
        logger.debug("Create ${NAME}: {}", dto);
        service.create(dto);
        return ResponseEntity.ok("${NAME} created");
    }
    
    @PutMapping("/$CamelCaseNamePlural")
    public ResponseEntity<Player> update(@RequestBody Player dto) {
        logger.debug("Update ${NAME}: {}", dto);
        Player updatedDto = service.update(dto);
        return ResponseEntity.ok(updatedDto);
    }
    
    @DeleteMapping ("/$CamelCaseNamePlural/{id}")
    public ResponseEntity<String> delete(@PathVariable ${PK_TYPE} id){
        logger.debug("Delete ${NAME} by id: {}", id);
        service.deleteById(id);
        return ResponseEntity.ok("${NAME} delete");
    }
    
}