package by.lamaka.race.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.annotation.PostConstruct;
import java.util.Random;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Rider {
    Long id;
    String name;
    Integer level;

    public Rider(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @PostConstruct
    public void init() {
        level = new Random().nextInt(5);
    }
}
