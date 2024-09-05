package common;

import domain.Member;

public class Session {
    private static Session instance;
    private Member currentMember;

    private Session(){}

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }


    public Member getCurrentMember() {
        return currentMember;
    }

    public void setCurrentMember(Member currentMember) {
        this.currentMember = currentMember;
    }

    public void removeCurrentMember(){
        this.currentMember = null;
    }

    public boolean isAuthenticated() {
        return currentMember != null;
    }
}
