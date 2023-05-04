public class BlueSquare extends Square {

    public BlueSquare(float height) {
        super(height, "BLUE");
    }
    
    public void draw() {
        System.out.println("Dentro de Retangulo " + getColor() + " de base " + getHeight() + " no método draw()");
    } 
}
