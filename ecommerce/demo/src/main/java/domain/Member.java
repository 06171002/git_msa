package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member {

    private long id;
    private String name;
    private String birth;
    private String phone;
    private String email;
    private String address;
    private String roginid;
    private String password;
    private String home;
    private int role;


}
