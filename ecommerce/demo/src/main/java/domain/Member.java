package domain;

import common.Role;
import lombok.Getter;

@Getter
public class Member {

    private Long id;
    private String name;
    private String birth;
    private String phone;
    private String email;
    private String address;
    private String loginId;
    private String password;
    private String home;
    private Role role;

    public Member(String name,
                  String birth,
                  String phone,
                  String email,
                  String address,
                  String loginId,
                  String password,
                  String home,
                  Role role) {
        this.name = name;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.loginId = loginId;
        this.password = password;
        this.home = home;
        this.role = role;
    }

    //== 정적 팩토리 메서드 ==//
    public Member of(String name, String birth) {
        return new Member(name, birth,
                null, null, null, null, null, null,
                Role.USER);
    }
}
