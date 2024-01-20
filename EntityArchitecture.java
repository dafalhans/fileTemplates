package ${PACKAGE_NAME}.web.rest;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ${PACKAGE_NAME}.service.service.${NAME}Service;
import ${PACKAGE_NAME}.service.dto.${NAME};

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ${NAME}Resource {

    private final ${NAME}Service service;
    
     @GetMapping("/${Resourcename}/health")
    public ResponseEntity<String> up(){
        return ResponseEntity.ok("${NAME} Resource up and running");
    }

    @GetMapping("/${Resourcename}")
    public ResponseEntity<List<${NAME}>> getAll(){
        List<${NAME}> dtos = service.getAll();
        return ResponseEntity.ok(dtos);
    }
    
    @GetMapping("/${Resourcename}/{id}")
    public ResponseEntity<${NAME}> getById(@PathVariable ${PK_TYPE} id) {
        ${NAME} dto = service.getById(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping ("/${Resourcename}")
    public ResponseEntity<String> create(@RequestBody ${NAME} dto){
        service.create(dto);
        return ResponseEntity.ok("${NAME} created");
    }
    
    @DeleteMapping ("/${Resourcename}/{id}")
    public ResponseEntity<String> delete(@PathVariable ${PK_TYPE} id){
        service.delete(id);
        return ResponseEntity.ok("${NAME} delete");
    }
    
}