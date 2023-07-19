package sample;

import java.util.Scanner;

public class Closeminx {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(closeMinMax(array));
    }
    public static int closeMinMax(int[] array)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int x : array)
        {
            if(x>max)
            {
                max = x;
            }
            if(x<min)
            {
                min = x;
            }
        }
        int lastmin = -1;
        int lastmax = -1;
        int result = array.length;

        for(int i=0;i<array.length;i++)
        {
            if(array[i] == min)
            {
                lastmin = i;
                if(lastmax>=0)
                {
                    result = Math.min(result,i-lastmax+1);
                }
            }
            if(array[i] == max)
            {
                lastmax = i;
                if(lastmin>=0)
                {
                    result = Math.min(result,i-lastmin+1);
                }
            }
        }
        return result;
    }


}
