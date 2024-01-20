#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import ${PACKAGE_NAME}.service.dto.${NAME};
import ${PACKAGE_NAME}.service.service.${NAME}Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
#set( $CamelCaseName = "$NAME.substring(0,1).toLowerCase()$NAME.substring(1)" )

@SpringBootApplication
public class Test_${NAME}_Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Test_${NAME}_Application.class, args);

        ${NAME}Service ${CamelCaseName}Srv = (${NAME}Service) ctx.getBean(${NAME}Service.class);

     
        ${NAME} dto1 = new ${NAME}();
        dto1.setId("100");
        dto1.setName("${NAME}" + " " + dto1.getId());
        ${CamelCaseName}Srv.create(dto1);
        
        ${NAME} dto2 = new ${NAME}();
        dto2.setId("200");
        dto2.setName("${NAME}" + " " + dto2.getId());
        ${CamelCaseName}Srv.create(dto2);

        ${NAME} dto3 = new ${NAME}();
        dto3.setId("300");
        dto3.setName("${NAME}" + " " + dto3.getId());
        ${CamelCaseName}Srv.create(dto3);

       ${NAME} dto4 = new ${NAME}();
        dto4.setId("400");
        dto4.setName("${NAME}" + " " + dto4.getId());
        ${CamelCaseName}Srv.create(dto4);

        System.out.println("All data:" + ${CamelCaseName}Srv.getAll());
        
        #if (${PK_TYPE} && ${PK_TYPE} == "Long")
        System.out.println("Get by ID:" + ${CamelCaseName}Srv.getById(200L));
        #end
        #if (${PK_TYPE} && ${PK_TYPE} == "String")
        System.out.println("Get by ID:" + ${CamelCaseName}Srv.getById("200"));
        #end
        


        System.out.println("Delete by ID: " + "300");
        #if (${PK_TYPE} && ${PK_TYPE} == "Long")
        ${CamelCaseName}Srv.deleteById("300L");
        #end
        #if (${PK_TYPE} && ${PK_TYPE} == "String")
        ${CamelCaseName}Srv.deleteById("300");
        #end
        System.out.println("All data:" + ${CamelCaseName}Srv.getAll());
    }
}