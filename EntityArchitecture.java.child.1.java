package ${PACKAGE_NAME};

import ${PACKAGE_NAME}.service.dto.${NAME};
import ${PACKAGE_NAME}.service.service.${NAME}Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Test_${NAME}_Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Test_${NAME}_Application.class, args);

        ${NAME}Service srv = (${NAME}Service) ctx.getBean(${NAME}Service.class);

        ${NAME} dto = new ${NAME}();
        dto.setId("100");
        dto.setCreationDate("16/02/2023");

        srv.create(dto);
        dto.setId("200");
        srv.create(dto);

        System.out.println("All date:" + srv.getAll());
        
        #if (${PK_TYPE} && ${PK_TYPE} == "Long")
        System.out.println("Get by ID:" + srv.getById(200L));
        #end
#if (${PK_TYPE} && ${PK_TYPE} == "String")
        System.out.println("Get by ID:" + srv.getById("200"));
        #end

    }

}