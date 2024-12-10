import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 10 numbers");
        int size =10;
        int[] num = new int[size];
        int sum=0,max=0,min=1000;

        for (int i = 0; i <num.length ; i++) {
            num[i]=input.nextInt();
            sum+=num[i];
            if (num[i]>max){
                max=num[i];
            }
            if (num[i]<min){
                min=num[i];
            }
        }
        float average =(float)sum/ num.length;
        Arrays.sort(num);
        double median=(num[4]+num[5])/2.0;
        int stanDeviation=0;

        for (int i =0; i <10; i++) {
            float deviation=num[i]-average;
            stanDeviation+=Math.pow(deviation,2);

        }
        int standard = stanDeviation/10;
        double standardDeviation=Math.sqrt(standard);

        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
        System.out.println("The maximum is: "+max);
        System.out.println("The minimum is: "+min);
        System.out.println("The median is: "+median);
        System.out.println("The standard deviation is: "+standardDeviation);
    }
}