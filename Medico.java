public class Medico extends Pessoa {
    private String crm;
    private String especialidade;

    public Medico(String nome, String cpf, String telefone, String email, String crm, String especialidade) {
        super(nome, cpf, telefone, email);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void relatorio() {
        System.out.println("\n===== DADOS DO MÉDICO =====");  
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());       
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);  
    }
}
