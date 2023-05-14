package Service;

import Base.Service.Impl.BaseSalableServiceImpl;
import Entity.Shoes;
import Repository.ShoesRepository;

public class ShoesService
        extends BaseSalableServiceImpl<Shoes, ShoesRepository> {
    

    public ShoesService(ShoesRepository repository) {
        super(repository);
    }
}
