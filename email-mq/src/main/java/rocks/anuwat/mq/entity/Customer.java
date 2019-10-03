package rocks.anuwat.mq.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Customer implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
}