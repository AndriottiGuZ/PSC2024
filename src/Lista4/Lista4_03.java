public class Lista4_03 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            if ((i % 2) < 1) {
                vetorA[i] = 20;
                System.out.println("vetorA [" + i + "] " + vetorA[i] + " eh par...");
            } else {
                vetorA[i] = 10;
                System.out.println("vetorA [" + i + "] " + vetorA[i] + " eh impar...");
            }
        }
    }
}