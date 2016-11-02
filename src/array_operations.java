/**
 * Created by Катя on 28.10.2016.
 */
public class array_operations {
    public static int sum(int array[]){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }

    public static int min (int array[]){
        int[] copy_array=array;
        boolean change = true;//booble sort

        while (change)
        {
            change = false;
            for (int j = 0; j < copy_array.length - 1; j++)
            {

                if (copy_array[j] < copy_array[j + 1])
                {
                    int t = copy_array[j + 1];
                    copy_array[j + 1] = array[j];
                    copy_array[j] = t;
                    change = true;
                }

            }
        }
      return copy_array[copy_array.length - 1];
    }

    public static int max (int array[]){
        int[] copy_array= array;
        boolean change = true;//booble sort

        while (change)
        {
            change = false;
            for (int j = 0; j < copy_array.length - 1; j++)
            {

                if (copy_array[j] < copy_array[j + 1])
                {
                    int t = copy_array[j + 1];
                    copy_array[j + 1] = copy_array[j];
                    copy_array[j] = t;
                    change = true;
                }

            }
        }
        return copy_array[0];
    }

    public static int mult (int array[]){
        int d=1;
        for (int i=0; i< array.length; i++){
            d*=array[i];
        }
        return d;
    }

    public static int modulus (int array[]){

return array[0]%array[array.length-1];
    }

    public static int  secondLargest(int array[]){
        for(int i=0; i< array.length;i++){
            if (array[i]!=array[i+1]) return array[i+1];
        }
        return 0;
    }

    public static void  maxPositive(int array[]){
        int count =0;// number of negative elements
        for(int i=0; i< array.length; i++){
            if(array[i]<0) count++;
        }
        System.out.println(" MAX POSITIVE " );
        if (array.length == count){ System.out.println("There are no positive elements in array");
            System.out.println("The biggest from negative elements" + array[0]);
        }
       else System.out.println("Max positive element: " + array[0]);
    }

    ///DOUBLE

    public static double sum(double array[]){
        double sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }

    public static double min (double array[]){
        double[] copy_array=array;
        boolean change = true;//booble sort

        while (change)
        {
            change = false;
            for (int j = 0; j < copy_array.length - 1; j++)
            {

                if (copy_array[j] < copy_array[j + 1])
                {
                    double t = copy_array[j + 1];
                    copy_array[j + 1] = array[j];
                    copy_array[j] = t;
                    change = true;
                }

            }
        }
        return copy_array[copy_array.length - 1];
    }

    public static double max (double array[]){
        double[] copy_array= array;
        boolean change = true;//booble sort

        while (change)
        {
            change = false;
            for (int j = 0; j < copy_array.length - 1; j++)
            {

                if (copy_array[j] < copy_array[j + 1])
                {
                    double t = copy_array[j + 1];
                    copy_array[j + 1] = copy_array[j];
                    copy_array[j] = t;
                    change = true;
                }

            }
        }
        return copy_array[0];
    }

    public static double mult (double array[]){
        double d=1;
        for (int i=0; i< array.length; i++){
            d*=array[i];
        }
        return d;
    }

    public static double modulus (double array[]){

        return array[0]%array[array.length-1];
    }

    public static double  secondLargest(double array[]){
        for(int i=0; i< array.length;i++){
            if (array[i]!=array[i+1]) return array[i+1];
        }
        return 0;
    }

    public static void  maxPositive(double array[]){
        int count =0;// number of negative elements
        for(int i=0; i< array.length; i++){
            if(array[i]<0) count++;
        }
        System.out.println(" MAX POSITIVE " );
        if (array.length == count){ System.out.println("There are no positive elements in array");
            System.out.println("The biggest from negative elements" + array[0]);
        }
        else System.out.println("Max positive element: " + array[0]);
    }

    public static void main (String[] arg){
        // INT


        System.out.println("ARRAY OF INTS");
        int[] a = {-3,-4,-6,-1,-14,-3,-8,-9,-2,-2};
        int[] copy_a =  {-3,-4,-6,-1,-14,-3,-8,-9,-2,-2};
        System.out.println("Array: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ") ;
        }
        int sum1 = sum(a);
        System.out.println();
        System.out.println("Sum "+sum1);
        int min=min(a);
        System.out.println("Min "+min);
        int max=max(a);
        System.out.println("Max "+max);
        int mult= mult(a);
        System.out.println("Multiplication "+mult);
        int mod= modulus(copy_a);
        System.out.println("Modulus of first and last element ");
        System.out.println(mod);

        int d= secondLargest(a);
        System.out.println("Second largest element: "+d);

        maxPositive(a);

        /// doubles
        System.out.println("ARRAY OF DOUBLES");
        double[] a_double = {-3.7,-4.7,-6.2,-1.9,-14.4,-3.8,-8.1,-9.0,-2.5,-2.8};
        double[] copy_a_double =  {-3.7,-4.7,-6.2,-1.9,-14.4,-3.8,-8.1,-9.0,-2.5,-2.8};
        System.out.println("Array: ");
        for(int i=0; i<a_double.length; i++){
            System.out.print(a_double[i]+" ") ;
        }
        double sum1_double = sum(a_double);
        System.out.println();
        System.out.println("Sum "+sum1_double);
        double min_double=min(a_double);
        System.out.println("Min "+min_double);
        double max_double=max(a_double);
        System.out.println("Max "+max_double);
        double mult_double= mult(a_double);
        System.out.println("Multiplication "+mult_double);
        double mod_double= modulus(copy_a_double);
        System.out.println("Modulus of first and last element ");
        System.out.println(mod_double);

        double d_double= secondLargest(a_double);
        System.out.println("Second largest element: "+d_double);

        maxPositive(a_double);

    }
}
