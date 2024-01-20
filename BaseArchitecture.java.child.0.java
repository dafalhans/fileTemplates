package ${PACKAGE_NAME}.service.mapper;

import java.util.List;
import ${PACKAGE_NAME}.service.dto.Base;
import ${PACKAGE_NAME}.business.BaseEntity;

public interface IMapper<E extends BaseEntity<?>, D extends Base> {

    List<D> toDTO(List<E> entities);

    List<E> toEntity(List<D> dtos);

    D toDTO(E entity);

    E toEntity(D dto);
}