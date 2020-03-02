public class FizzBuzz{
    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 25};
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.checkFizzOrBuzz();
    }

    public void checkFizzOrBuzz(){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]%3 == 0 && numbers[i]%5 == 0){
                System.out.println(numbers[i] + " FizzBuzz");
            }else if(numbers[i]%3 == 0){
                System.out.println( numbers[i] + " Fizz");
            }else if(numbers[i]%5 == 0){
                System.out.println(numbers[i] + " Buzz");
            }else {
                System.out.println(numbers[i]);
            }
        }

        System.out.println();
        for(int nums : numbers){
            if(nums%3 == 0){
                System.out.println( nums + " Fizz");
            }else if(nums%5 == 0){
                System.out.println(nums + " Buzz");
            }else if(nums%15 == 0){
                System.out.println(nums + " FizzBuzz");
            }else {
                System.out.println(nums);
            }
        }
    }
}