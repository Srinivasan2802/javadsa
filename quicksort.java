//quicksort implementation//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        quicksort(a, 0, n - 1);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static int part(int[] a, int l, int h) {
        int i = l, j = h;
        int pivot = a[l];
      //moving the  pivot to its position 
      while (i < j) { 
            while (a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
          //preserving left side  and right side elements 
            if (i < j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        int tmp = a[j];
        a[j] = a[l];
        a[l] = tmp;
        return j;
    }

    public static void quicksort(int[] a, int l, int h) {
      //recursive call
        if (l < h) {
            int j = part(a, l, h);
            quicksort(a, l, j - 1);
            quicksort(a, j + 1, h);
        }
    }
}

