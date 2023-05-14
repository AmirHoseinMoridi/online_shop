package Base.Service;

import Base.Entity.BaseEntity;
import Base.Entity.BaseSalable;

public interface BaseSalableService<T extends BaseSalable> extends BaseService<T,Long> {
    T findByName(String name);
}
