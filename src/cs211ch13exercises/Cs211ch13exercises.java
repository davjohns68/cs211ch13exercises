// W.P. Iverson code for testing text Exercises
// mystery methods from Chapter 13
// Building Java Programs
//
// copyleft October 2016
package cs211ch13exercises;
import java.util.*;

public class Cs211ch13exercises {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
	Random r = new Random();
	int N = 160000;
        int[] intArray = new int[N];
        long time = 0;
	for (int i=0; i<N; i++) {
            list.add(Math.abs(r.nextInt()));
            intArray[i] = r.nextInt();
        }
        
        System.out.println("Mystery1");
        for (int i = 0; i < 10; i++) {
            time = System.currentTimeMillis();
            mystery1(intArray);
            System.out.println(System.currentTimeMillis() - time);
        }
        
        System.out.println("Mystery2");
        for (int i = 0; i < 10; i++) {
            time = System.currentTimeMillis();
            mystery2(intArray);
            System.out.println(System.currentTimeMillis() - time);
        }
        
        System.out.println("Mystery3");
        for (int i = 0; i < 10; i++) {
            time = System.currentTimeMillis();
            mystery3(list);
            System.out.println(System.currentTimeMillis() - time);
        }
        
        System.out.println("Mystery4");
        for (int i=0; i<10; i++){ 
            time = System.currentTimeMillis();
            mystery4(list);		
            System.out.println(System.currentTimeMillis()-time);
	}
    }
    
    public static int[] mystery1(int[] list) {
        int[] result = new int[2 * list.length];
        for (int i = 0; i < list.length; i++) {
            result[2 * i] = list[i] / 2 + list[i] % 2;
            result[2 * i + 1] = list[i] / 2;
        }
        return result;
    }
    
    public static void mystery2(int[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            int j = list.length - 1 - i;
            int temp = list[i];
            list[i]= list[j];
            list[j] = temp;
        }
    }
    
    public static void mystery3(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            int first = list.remove(i);
            list.add(i + 1, first);
        }
    }

    public static void mystery4(List<Integer> list) {
	for (int i = 0; i < list.size() - 1; i += 2) {
            Integer first = list.get(i);
		list.set(i,  list.get(i + 1));
		list.set(i + 1,  first);
	}
    }    
}
