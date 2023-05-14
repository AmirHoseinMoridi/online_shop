package Base.Repository;

import Base.Entity.BaseSalable;

public interface BaseSalableRepository<T extends BaseSalable>
        extends BaseRepository<T,Long> {
    T findByName(String name);

}
