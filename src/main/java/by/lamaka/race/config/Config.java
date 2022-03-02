package by.lamaka.race.config;

import by.lamaka.race.model.Horse;
import by.lamaka.race.model.Pair;
import by.lamaka.race.model.Rider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "by.lamaka.race")
public class Config {

    @Bean("horse1")
    public Horse getHorse1() {
        return Horse.builder()
                .id(1L)
                .name("Kesha")
                .build();
    }

    @Bean("horse2")
    public Horse getHorse2() {
        return Horse.builder()
                .id(2L)
                .name("Klop")
                .build();
    }

    @Bean("horse3")
    public Horse getHorse3() {
        return Horse.builder()
                .id(3L)
                .name("Semen")
                .build();
    }

    @Bean("rider1")
    public Rider getRider1() {
        return Rider.builder()
                .id(1L)
                .name("Lera")
                .build();
    }

    @Bean("rider2")
    public Rider getRider2() {
        return Rider.builder()
                .id(2L)
                .name("Katya")
                .build();
    }

    @Bean("rider3")
    public Rider getRider3() {
        return Rider.builder()
                .id(3L)
                .name("Sasha")
                .build();
    }

    @Bean("pair1")
    public Pair getPair1(Horse horse1, Rider rider1) {
        return Pair.builder()
                .id(1L)
                .horse(horse1)
                .rider(rider1)
                .build();
    }

    @Bean("pair2")
    public Pair getPair2(Horse horse2, Rider rider2) {
        return Pair.builder()
                .id(2L)
                .horse(horse2)
                .rider(rider2)
                .build();
    }

    @Bean("pair3")
    public Pair getPair3(Horse horse3, Rider rider3) {
        return Pair.builder()
                .id(3L)
                .horse(horse3)
                .rider(rider3)
                .build();
    }
}
