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
public class Horse {
    private Long id;
    private String name;
    private Integer speed;

    public Horse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @PostConstruct
    public void init() {
        speed = new Random().nextInt(30);
    }
}
