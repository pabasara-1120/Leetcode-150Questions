//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = {5,7,2,6,1,9,8};


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

            int n = array.length;
            for(int i=1;i<n;i++){
                int temp = array[i];
                int j = i-1;
                while( j>=0 && array[j]>temp){
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = temp;
            }

        for (int j : array) {
            System.out.println(j);
        }

    }
}