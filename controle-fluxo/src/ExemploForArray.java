// ExemploFor.java
public class ExemploForArray {
    public static void main(String[] args) {
        
        //em arrays o índice inicia em zero (0)
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        //Maneira comum
        /* for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
         }
        */

        //Maneira otimizada, enxuta
        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}