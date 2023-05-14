package Base.Service.Impl;

import Base.Entity.BaseUser;
import Base.Repository.BaseUserRepository;
import Base.Service.BaseUserService;

public class BaseUserServiceImpl<T extends BaseUser, R extends BaseUserRepository<T>>
        extends BaseServiceImpl<T, Integer, R>
        implements BaseUserService<T> {

    public BaseUserServiceImpl(R repository) {
        super(repository);
    }

    @Override
    public T findByUserName(String userName) {
        return repository.findByUserName(userName);
    }
}
