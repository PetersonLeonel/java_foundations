public class Aluno {
    private String nome;
    private String endereco;
    private int idade;
    private int matricula;

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void mostrarAluno() {
        System.out.println("Nome: " + nome);
    }
}