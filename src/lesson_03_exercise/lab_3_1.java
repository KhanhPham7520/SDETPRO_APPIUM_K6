package lesson_03_exercise;

public class lab_3_1 {

    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        int countEventNumbers = 0;
        int countOddNumbers = 0;

        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] % 2 == 0){
                countEventNumbers++;
            }else{
                countOddNumbers++;
            }
        }
        System.out.println("Event numbers : "+countEventNumbers);
        System.out.println("Odd numbers : "+countOddNumbers);

    }
}
