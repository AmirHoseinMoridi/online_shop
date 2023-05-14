package Base.Service.Impl;

import Base.Entity.BaseEntity;
import Base.Repository.BaseRepository;
import Base.Service.BaseService;

import java.sql.SQLException;
import java.util.List;

public class BaseServiceImpl<T extends BaseEntity<ID>, ID, R extends BaseRepository<T, ID>>
        implements BaseService<T, ID> {
    protected final R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public ID sava(T t)  {
        try {
            return repository.sava(t);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean deleteById(ID id) {
        return repository.deleteById(id);
    }
}
