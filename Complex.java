import java.lang.*;
class MyComplex{
  int r,i;
  public static MyComplex getComplex(int r, int i){
    MyComplex temp = new MyComplex();
    temp.r = r;
    temp.i = i;
    return temp;
  }
  public static MyComplex addComplex(MyComplex a,MyComplex b){
    MyComplex temp= new MyComplex();
    temp.r = a.r+b.r;
    temp.i = a.i+b.i;
    return temp;
  }
  public static MyComplex subComplex(MyComplex a,MyComplex b){
    MyComplex temp= new MyComplex();
    temp.r = a.r-b.r;
    temp.i = a.i-b.i;
    return temp;
  }
  public static MyComplex mulComplex(MyComplex a,MyComplex b){
    MyComplex temp= new MyComplex();
    temp.r = a.r*b.r - a.i*b.i;
    temp.i = a.i*b.i + a.i*b.i;
    return temp;
  }
  public static void showComplex(MyComplex c){
    System.out.print(c.r+"+"+c.i+"i\n");
  }
}
class Complex{
  public static void main(String[] args){
    MyComplex a = new MyComplex();
    MyComplex b = new MyComplex();
    MyComplex c = new MyComplex();
    a = MyComplex.getComplex(5,2);
    b = MyComplex.getComplex(9,7);
    System.out.print("A= ");
    MyComplex.showComplex(a);
    System.out.print("B= ");
    MyComplex.showComplex(b);
    c = MyComplex.addComplex(a,b);
    System.out.print("C = A+B = ");
    MyComplex.showComplex(c);
    c = MyComplex.subComplex(a,b);
    System.out.print("C = A-B = ");
    MyComplex.showComplex(c);
    c = MyComplex.mulComplex(a,b);
    System.out.print("C = AxB = ");
    MyComplex.showComplex(c);

  }
}
