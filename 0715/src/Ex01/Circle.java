package Ex01;

class Circle {
//private 변수는 setter getter 로 참조가능

    private int rad;
    private String name;

    public Circle() {}

    public Circle(int i) {
        if (i < 0) {
            this.rad =0;
        }
        this.rad = i;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.equals("")) {
            this.name = "홍길동";
            return;
        }
        this.name = name;
    }


    public void setRad(int rad) {
        if (rad < 0) {
            this.rad =0;

        }
        this.rad = rad;
    }

    public int getRad() {

        return rad;
    }

    public double getArea() {
        return 3.14*rad*rad;
    }

}


 

//    public void setName(String name) {
//        if (name.equals("")) {
//            this.name = "홍길동";
//            return;
//        }
//        this.name = name;
//    }
//
//    public void setRad(int r) {
//        if (r < 0) {
//            rad = 0;
//            return;
//        }
//        rad = r;
//    }
//
//    public int getRad() {
//        return rad;
//    }
//}
