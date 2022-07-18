public class Main {
    private static int count =0;
    public static void main(String[] args) {
        checkCount();
        checkCount();
        checkCount();
        checkCount();
        checkCount();
        checkCount();
        checkCount();
        checkCount();
    }
    private static void checkCount() {
        if(count<5) {
            System.out.println("It is okay");
            count++;
        }
        else {
            System.out.println("The limit has been reached");
        }
    }
}