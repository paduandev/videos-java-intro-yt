import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        final int QTDE_ALUNOS = 20;
        final int QTDE_TURMAS = 5;
        Scanner scanner = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral = 0;

        for (int turma = 1; turma <= QTDE_TURMAS; turma++) {
            mediaTurma = 0;
            System.out.println("Dados da turma " + turma);
            for (int aluno = 1; aluno <= QTDE_ALUNOS; aluno++) {
                System.out.println("Digite a média do aluno " + aluno);
                mediaAluno = scanner.nextDouble();
                mediaTurma += mediaAluno;
            }
            mediaTurma /= QTDE_ALUNOS;
            System.out.println("Média da turma " + turma + ": " + mediaTurma);
            mediaGeral += mediaTurma;
        }
        mediaGeral /= QTDE_TURMAS;
        System.out.println("Média geral: " + mediaGeral);

        scanner.close();
    }
}
