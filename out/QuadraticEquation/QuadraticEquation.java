public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    public  QuadraticEquation(double aInput, double bInput, double cInput) {
        this.a = aInput;
        this.b = bInput;
        this.c = cInput;
    }
    public  QuadraticEquation(double delta){
        this.delta = delta;
    }

    @Override
    public String toString() {
         return  "QuadraticEquation =" + a + "x2"+ " + " + b + "x" + " + " + c + "= 0";
    }

    public double getA(){
        return this.a;
    }

    public void setA(double aInput) {
        this.a = aInput;
    }
     public double getB(){
        return  this.b;
     }

    public void setB(double bInput) {
        this.b = bInput;
    }
    public double getC(){
        return  this.c;
    }

    public void setC(double cInput) {
        this.b = cInput;
    }
    public double getDiscriminant(){
        this.delta = Math.pow(this.b , 2) - (4 * this.a * this.c);
        return this.delta;
    }

    public boolean checkDiscriminant(){
        boolean result = true;
        this.delta = Math.pow(this.b , 2) - (4 * this.a * this.c);
        if(this.delta < 0){
            result = false;
        }
        return result ;
    }

    public double getRoot1(){
        double x1;
        if(this.delta == 0){
            x1 = -this.b / (2 * this.a);
        }else{
            x1 = (-this.b + Math.sqrt(this.delta)) / (2 * this.a);
        }
        return x1;
    }
    public double getRoot2(){
        double x2;
        if(this.delta == 0){
            x2 = -this.b / (2 * this.a);
        }else{
            x2 = (-this.b - Math.sqrt(this.delta)) / (2 * this.a);
        }
        return x2;
    }


}
