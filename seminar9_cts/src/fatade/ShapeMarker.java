package fatade;

public class ShapeMarker {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMarker(){
        circle=new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void deawSquare(){
        square.draw();
    }
}
