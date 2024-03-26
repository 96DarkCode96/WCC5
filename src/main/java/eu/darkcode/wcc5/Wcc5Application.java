package eu.darkcode.wcc5;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Getter
@SpringBootApplication
public class Wcc5Application {

    private final User me;
    private final User mother;
    private final User father;
    private final User sister;

    public Wcc5Application(User me, User mother, User father, User sister) {
        this.me = me;
        this.mother = mother;
        this.father = father;
        this.sister = sister;
    }

    public static void main(String[] args) {
        SpringApplication.run(Wcc5Application.class, args);
    }

    @PostConstruct
    public void printFamily() {
        System.out.println(me);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(sister);
    }

}
