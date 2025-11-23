public class OOPS1 {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("blue");
        p1.setTip(5);

        System.out.println("Pen color: " + p1.color);
        System.out.println("Pen tip size: " + p1.tip);
    }
}

class pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}