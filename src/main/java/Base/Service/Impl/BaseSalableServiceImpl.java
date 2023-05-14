package Base.Service.Impl;

import Base.Entity.BaseSalable;
import Base.Repository.BaseSalableRepository;
import Base.Service.BaseSalableService;

import java.sql.SQLException;

public class BaseSalableServiceImpl<T extends BaseSalable,R extends BaseSalableRepository<T>>
        extends BaseServiceImpl<T,Long,R>
        implements BaseSalableService<T> {
    public BaseSalableServiceImpl(R repository) {
        super(repository);
    }



    @Override
    public T findByName(String name) {
        return repository.findByName(name);
    }
}
