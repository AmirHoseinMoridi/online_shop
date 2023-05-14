package Util;

import Entity.Book;
import Entity.Consumer;
import Entity.Enumeration.ProducerRank;
import Entity.Enumeration.UserType;
import Entity.Producer;
import Entity.Shoes;

import java.sql.Date;

public class Faker {
    public static Consumer createConsumer(){
        Consumer consumer = new Consumer();
        consumer.setFirsName("ali");
        consumer.setLastName("ahmadi");
        consumer.setUserName("ali123");
        consumer.setAge(54);
        consumer.setUserType(UserType.CONSUMER);
        consumer.setDateOfLogIn(new Date(100L));
        consumer.setPassword("32");
        return consumer;
    }
    public static Producer createProducer(){
        Producer producer = new Producer();
        producer.setFirsName("amir2");
        producer.setLastName("moridi2");
        producer.setAge(24);
        producer.setUserType(UserType.PRODUCER);
        producer.setPassword("1234");
        producer.setUserName("amirH");
        producer.setProducerRank(ProducerRank.MANAGER);
        return producer;
    }
    public static Shoes createShoes(){
        Shoes shoes = new Shoes();
        shoes.setName("adidas");
        shoes.setPrice(10.5);
        shoes.setSize(42);
        return shoes;
    }

    public static Book createBook(){
        Book book = new Book();
        book.setName("5pm club");
        book.setPrice(7);
        book.setAuthor("rubin");
        return book;
    }
}
