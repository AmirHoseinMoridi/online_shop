package Base.Repository;

import Base.Entity.BaseUser;

public interface BaseUserRepository<T extends BaseUser>
        extends BaseRepository<T,Integer>{

    T findByUserName(String userName);
}
