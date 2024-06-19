public class Triangolo extends Forma{

    private float a;
    private float b;

    public Triangolo(float a, float b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void calcolaArea(){
        float areaTriangolo = (a * b) / 2;
        System.out.println(areaTriangolo);
    }
}
