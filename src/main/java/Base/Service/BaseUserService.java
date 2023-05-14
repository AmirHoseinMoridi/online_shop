package Base.Service;

import Base.Entity.BaseUser;

public interface BaseUserService<T extends BaseUser> extends BaseService<T,Integer>{
    T findByUserName(String userName);
}
