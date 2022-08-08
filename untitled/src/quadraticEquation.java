public class quadraticEquation {
    double a ,b ,c;
    public quadraticEquation(){}
    public quadraticEquation(double a, double b, double c){
        this.a = a;
        this.b= b;
        this.c = c;
    }
    public double getDiscriminant(){
        return this.b*this.b - 4*this.a*this.c;
    }
    private double getRoot1(){
        double x1;
        x1 = (-this.b + Math.pow(this.getDiscriminant(),1/2)/(2*this.a));
        return x1;
    }
    private double getRoot2(){
        double x2;
        x2 = (-this.b - Math.pow(this.getDiscriminant(),1/2)/(2*this.a));
        return x2;
    }
    public String getRoot() {
        if (this.getDiscriminant() < 0){
            return " Phuong trinh vo nghiem " ;
        }
        else if (this.getDiscriminant() == 0){
            return " Phuong trinh co nghiem kep " + this.getRoot1();
        }else {
           return "Phuong trinh co 2 nghiem phan biet x1= " + this.getRoot1() + " x2= " + this.getRoot2();
        }
    }
}
