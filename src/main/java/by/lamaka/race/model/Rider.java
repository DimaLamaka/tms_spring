package by.lamaka.race.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Random;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rider {
    Long id;
    String name;
    Integer level;

    public Rider(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void init(){
        level = new Random().nextInt(5);
    }
}
