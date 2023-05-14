package Service;

import Base.Service.Impl.BaseUserServiceImpl;
import Entity.Producer;
import Repository.ProducerRepository;

public class ProducerService
        extends BaseUserServiceImpl<Producer, ProducerRepository> {


    public ProducerService(ProducerRepository repository) {
        super(repository);
    }
}
