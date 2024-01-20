#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.springframework.stereotype.Repository;
import ${PACKAGE_NAME}.business.${NAME}Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ${NAME}Repository extends JpaRepository<${NAME}Entity, ${PK_TYPE}>{
    
}