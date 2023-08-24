import java.util.Scanner;

public class FindAvg {
    float avg;
    int counter;

    public float avg(float... x) {
        for (float f : x) {

            avg += f;

            counter++;
        }
        avg = avg / counter;
        return avg;

    }

    public static void main(String[] args) {
        FindAvg fv = new FindAvg();
        System.out.println(fv.avg(78, 65, 78,87,87));
    }

}
