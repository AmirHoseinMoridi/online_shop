import Entity.Consumer;
import Entity.Producer;
import Entity.Shoes;
import Util.ApplicationContext;
import Util.Faker;

public class shopping_app {

    public static void main(String[] args) {
        Producer producer = Faker.createProducer();
        Shoes shoes = Faker.createShoes();
        Consumer consumer = Faker.createConsumer();

        System.out.println(ApplicationContext.getConsumerService().sava(consumer));

    }
}
