public class Point {

    private int xpos;
    private int ypos;

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public void showPoint(){
        System.out.printf("[%d,%d]\n",xpos,ypos);
    }
}
