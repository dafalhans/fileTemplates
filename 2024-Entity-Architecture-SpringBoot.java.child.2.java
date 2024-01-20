#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class ${NAME} extends Base{

}