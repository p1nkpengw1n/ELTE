public class PrintableAndReversablePoint extends Point implements Printable, Reversable {
    private int prevX;
    private int prevY;
    
    public PrintableAndReversablePoint(int x, int y) {
        super(x,y);
        this.prevX = x;
        this.prevY = y;
    }

    @Override 
    public void setX(int x) {
        prevX = this.x;
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        prevY = this.y;
        super.setY(y);
    }

    public void reverse() {
        x = prevX;
        y = prevY;
    }

    public void print() {
        System.out.println("("+ x + "," + y + ")");
    }
}
