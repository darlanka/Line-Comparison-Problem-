import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparision Computation Program on Master branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("the first point :");
        int px1 = sc.nextInt();
        int py1 = sc.nextInt();
        System.out.println("now the second point : ");
        int px2 = sc.nextInt();
        int py2 = sc.nextInt();
        distance d1 = new distance();
        double ans = d1.dis(px1,py1,px2,py2);
        // checking if two lines are equal or not! by using the end points
        // so dis (x1,y1,x2,y2) == dis(x2,y2,x1,y1) must be equal
        if(d1.dis(px1,py1,px2,py2) == d1.dis(px2,py2,px1,py1)){
            System.out.println("Both lines are equal!");
        }
        else{
            System.out.println("both are not equal!");
        }
    }
}