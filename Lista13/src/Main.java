import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno ap1 = new AlunoDeMusica("luis",19,"123","Gotico");
        Aluno am1 = new AlunoDePintura("Lorenzo",26,"321","Violão");
        adicionarAluno(alunos,ap1);
        adicionarAluno(alunos,am1);

    }
    public static void adicionarAluno(ArrayList<Aluno> alunos, Aluno aluno){
        alunos.add(aluno);
    }
}
