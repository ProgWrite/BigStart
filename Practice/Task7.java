public class Task7 {
    public static void main(String[] args) {
        int[] array = {2,3,5};
        try{
            System.out.println(array[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Poiman exception: " + e.getMessage());
        }
        finally {
            System.out.println("Poiman finally");
        }
    }
}












