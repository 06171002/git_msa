package domain;

import common.Role;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Member {
    private Long memberId;
    private String username;
    private String password;
    private String name;
    private String birth;
    private String phone;
    private String email;
    private String address;
    private String home;
    private Role role;

    public static Member of(String username, String password, String name, String birth, String phone, String email, String address, String home, Role role){
        return new Member(null,username,password,name,birth,phone,email,address,home,role);
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getHome() {
        return home;
    }

    public Role getRole() {
        return role;
    }
}
