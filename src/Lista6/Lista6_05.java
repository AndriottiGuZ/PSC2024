package Lista6;

public class Lista6_05 {
    public static void main(String[] args) {
        int[] vetor = new int[10];


        for (int i=0;i<vetor.length;i++){
            vetor[i]=i;
            CalculdorParOuImpar(vetor[i]);
        }
    }
    private static void CalculdorParOuImpar(int vetor) {
        if (vetor%2==0){
            System.out.printf("vetor [%d] eh = 20\n",vetor);}else
            System.out.printf("vetor [%d] eh = 10\n",vetor);

    }
}
