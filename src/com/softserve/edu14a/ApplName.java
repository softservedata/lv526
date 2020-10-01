package com.softserve.edu14a;

import java.util.Scanner;

@FunctionalInterface
interface MyFunctional {
    double f(double x);
    //double g(double x);
}

/*-
class MyF implements MyFunctional {
    @Override
    public double f(double x) {
        return x * x;
    }
}

class MyF2 implements MyFunctional {
    @Override
    public double f(double x) {
        return Math.sin(x);
    }
}
*/

public class ApplName {
    
    public static double xx(double x) {
        return x * x;
    }
    
    public double x2(double x) {
        return x * x;
    }

    public double integral(MyFunctional mf, double a, double b, int n) {
        double x;
        double h = (b - a) / n;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            x = a + i * h;
            sum = sum + mf.f(x);
        }
        return h * sum;
    }

    public static void main(String[] args) {
        ApplName app = new ApplName();
        double a;
        double b;
        int n;
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        a = sc.nextDouble();
        System.out.print("b= ");
        b = sc.nextDouble();
        System.out.print("n= ");
        n = sc.nextInt();
        // sc.close();
        //
        // Before Java-8. Call Back
//        MyFunctional myf = new MyF();
//        System.out.println("x2 Integral = " + app.integral(myf, a, b, n));
        //
        // Anonymous classes
//        System.out.println("x2 Integral = " + app.integral(
//              new MyFunctional() {
//                  @Override
//                  public double f(double x) {
//                      return x * x;
//                  }
//              },
//              a, b, n));
        //
        // Java-8. Reference
//        MyFunctional f1 = app::x2;
        /*- Real
        MyFunctional f1 = new MyFunctional() {
            @Override
            public double f(double x) {
                return app.x2(x);
            }
        };
        */
//        MyFunctional f1 = ApplName::xx;
//        System.out.println("x2 Integral = " + app.integral(f1, a, b, n));
        //
        // Java-8. Add Lambda
        MyFunctional f1 = x->x*x; // (double x) -> {...;return x*x;}
//        MyFunctional f1 = (double x)->{return x*x;};
        /*-
        MyFunctional f1 = new MyFunctional() {
            @Override
            public double f(double x) {
                return x*x;
            }
        };
        */
        System.out.println("x2 Integral = " + app.integral(f1, a, b, n));
        //
        System.out.println("x2 Integral = " + app.integral(x -> x * x, a, b, n));
        //
        System.out.println("app::x2 Integral = " + app.integral(app::x2, a, b, n));
        System.out.println("ApplName::xx Integral = " + app.integral(ApplName::xx, a, b, n));
        //
    }
}
