#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.util;#end

#set( $CamelCaseName = "$NAME.substring(0,1).toLowerCase()$NAME.substring(1)" )

import java.util.ArrayList;
import java.util.List;

public interface IMapper <D,E>{

    E toEntity(D d);

    D toDto(E e);

    default List<E> toEntity(List<D> ds){
        List<E>  es = new ArrayList<>();
        ds.forEach(d -> es.add(toEntity(d)));
        return es;
    }

    default List<D> toDto(List<E> es){
        List<D> ds = new ArrayList<>();
        es.forEach(e -> ds.add(toDto(e)));
        return ds;
    }


}