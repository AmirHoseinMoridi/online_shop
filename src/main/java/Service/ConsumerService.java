package Service;

import Base.Entity.BaseUser;
import Base.Service.Impl.BaseUserServiceImpl;
import Entity.Consumer;
import Repository.ConsumerRepository;

public class ConsumerService
extends BaseUserServiceImpl<Consumer, ConsumerRepository> {


    public ConsumerService(ConsumerRepository repository) {
        super(repository);
    }
}
