public class Paciente extends Pessoa {
    private String planoSaude;

    public Paciente(String nome, String cpf, String telefone, String email, String planoSaude) {
        super(nome, cpf, telefone, email);
        this.planoSaude = planoSaude;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }
    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public void relatorio() {
    System.out.println("\n===== DADOS DO PACIENTE =====");
    System.out.println("Nome: " + getNome());
    System.out.println("CPF: " + getCpf());
    System.out.println("Telefone: " + getTelefone());
    System.out.println("Email: " + getEmail());
    System.out.println("Plano de Saúde: " + planoSaude);
    System.out.println("=============================\n");
    }
    
}
