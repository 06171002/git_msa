package org.example.aa;

public class BizMan extends Man{

    private String company;
    private String position;


    public BizMan(String position) {
        this.position = position;
    }
    //sub 생성자 맨윗줄에 super 생성자 하나 필요
    //부모에서 default 생성자가 없고, 다른 생성자 있으면 default 자동생성 x
    public BizMan(String name, String company, String position) {

        this.company = company;
        this.position = position;
    }

    public BizMan(String company, String position) {
//        super(name);
        this.company = company;
        this.position = position;
    }

    public void showInfo() {
        System.out.println("company = " +company);
        System.out.println("position = " +position);

        tellInfo();
    }

    @Override
    public String toString() {
        return "BizMan{" +
                "company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
