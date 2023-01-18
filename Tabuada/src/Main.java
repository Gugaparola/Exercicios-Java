public class Main{
    public static void main(String[ ] args) {
        for(int x = 1; x <= 10; x++){
            System.out.print("\nTabuada do " + x + "\n\n");
            for(int z = 0; z <= 10; z++) {
                System.out.print(x + " X " + z + " = " + x * z +"\n");
            }
        }
    }
}