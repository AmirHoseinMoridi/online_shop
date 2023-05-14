package Base.Repository;

import Base.Entity.BaseEntity;

import java.sql.SQLException;
import java.util.List;

public interface BaseRepository<T extends BaseEntity<ID>,ID> {
    ID sava(T t) throws SQLException;
    T findById(ID id);
    List<T> findAll();
    boolean deleteById(ID id);
}
