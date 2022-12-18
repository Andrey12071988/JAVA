/**
 * program_03
 * Метод быстрой сортировки (Сортировка Хоара)
 */
public class program_03 {
    public static void main(String[] args){
        int[] input = {3,1,9,8,2,7,1,21,5,101,1}; // Сортируемый массив
        int start = 0; // с какой позиции массива будет присходить сортировка
        int end = input.length-1; // до какой позиции массива будет присходить сортировка
        quickSort(start, end, input);
        for(int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }

    protected static void quickSort(int start, int end, int[] a){
        if(start<end){
            int index=partition(start,end,a);
            quickSort(start,index-1,a); //сортировка первой половины массива
            quickSort(index+1,end,a);   //сортировка второй половины массива
        }
        return;
    }

    protected static int partition(int start, int end, int[] a){
        int p = start;
        int i = start;
        int j= end;

        while (i< j){
            while(a[i]<= a[p] && i< end){
                i++;
            }
            while(a[j]> a[p] && j > start){
                j--;
            }
            if(i< j){
                swap(i,j,a);
            }
        }
        swap(j,p,a); // смена позиций элементов в массиве
        return j;
    }

    private static void swap(int p1, int p2, int[] a){
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }

}