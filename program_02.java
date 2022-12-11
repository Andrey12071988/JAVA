public class program_02 {
    public static void main(String[] args) {
        int disks = 5;
        doTowers(disks, 'A', 'B', 'C');
     }
     public static void doTowers(int disks, char start,
     char medium, char end) {
        if (disks == 1){
           System.out.println("Диск 1 переместить с "
           + start + " на " + end);
        }else {
           doTowers(disks - 1, start, end, medium);
           System.out.println("Диск "
           + disks + " переместить с " + start + " на " + end);
           doTowers(disks - 1, medium, start, end);
        }
     }
  }