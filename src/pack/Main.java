package pack;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble(), y = s.nextDouble();
        System.out.println((y>=2*x&&y<=3*x&&x>=0&&y!=2*x&&y!=3*x) ? "Yes" : "No");
    }
}
