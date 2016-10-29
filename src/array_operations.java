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

    public static int[] modulus (int array[]){
        int [] res = new int[2];
        res[0]=Math.abs(array[0]);
        res[1]=Math.abs(array[array.length-1]);
return res;
    }

    public static int  secondLargest(int array[]){
        for(int i=0; i< array.length;i++){
            if (array[i]!=array[i+1]) return array[i+1];
        }
        return 0;
    }

    public static int  maxPositive(int array[]){
        return array[0];
    }

    public static void main (String[] arg){
        int[] a = {-3,4,6,1,-14,3,8,9,2,1};
        int[] copy_a = {-3,4,6,1,-14,9,8,9,2,1};
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
        int[] mod= modulus(copy_a);
        System.out.println("Modulus of first and last element ");
        for(int i=0; i<mod.length;i++){
            System.out.println(mod[i]);
        }
        int d= secondLargest(a);
        System.out.println("Second largest element: "+d);
        int m=maxPositive(a);
        System.out.println("Max positive element: " + m);



    }
}
