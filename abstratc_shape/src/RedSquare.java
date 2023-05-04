public class RedSquare extends Circle {

    public RedSquare(float ray) {
        super(ray, "RED");
    }
    
    public void draw() {
        System.out.println("Dentro de Retangulo " + getColor() + " de base " + getHeight() + " no método draw()");
    } 
}