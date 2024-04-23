public class Lista4_02 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int a=0;
        for (int i=0; i < vetorA.length; i++){
            a+=10;
            vetorA[i]=a;
            System.out.println("vetorA ["+i+"] "+vetorA[i]);
        }
    }
}
