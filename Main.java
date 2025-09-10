import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();

        medicos.add(new Medico("Dr. João Silva", "11122233344", "61999999999", "joao@clinica.com", "CRM1234", "Cardiologia"));
        medicos.add(new Medico("Dra. Maria Oliveira", "55566677788", "61988888888", "maria@clinica.com", "CRM5678", "Dermatologia"));
        medicos.add(new Medico("Dr. Pedro Souza", "99988877766", "61977777777", "pedro@clinica.com", "CRM9012", "Ortopedia"));

        pacientes.add(new Paciente("Carlos Lima", "12345678900", "61911111111", "carlos@email.com", "Particular"));
        pacientes.add(new Paciente("Ana Paula", "98765432100", "61922222222", "ana@email.com", "Amil"));
        pacientes.add(new Paciente("Fernanda Costa", "45678912300", "61933333333", "fernanda@email.com", "Particular"));

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("\n=== SISTEMA DE CLÍNICA ===");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Cadastrar Médico");
            System.out.println("3 - Relatório de Pacientes e Médicos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    //TODO: CADASTRO DE PACIENTE
                    System.out.print("Nome do Paciente: ");
                    String nomeP = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfP = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telP = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailP = scanner.nextLine();
                    System.out.print("Plano de Saúde: ");
                    String plano = scanner.nextLine();

                    Paciente paciente = new Paciente(nomeP, cpfP, telP, emailP, plano);
                    pacientes.add(paciente);
                    System.out.println("Paciente " + nomeP + " cadastrado com sucesso!\n");

                    break;
                case 2:
                    //TODO: CADASTRO DE MEDICO
                    System.out.print("Nome do Médico: ");
                    String nomeM = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfM = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telM = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailM = scanner.nextLine();
                    System.out.print("CRM: ");
                    String crm = scanner.nextLine();
                    System.out.print("Especialidade: ");
                    String especialidade = scanner.nextLine();

                    Medico medico = new Medico(nomeM, cpfM, telM, emailM, crm, especialidade);
                    medicos.add(medico);
                    System.out.println("Médico " + nomeM + " cadastrado com sucesso!\n");
                    break;
                
                case 3:
                    //TODO: RelATÓRIO DE PACIENTES E MÉDICOS
                    System.out.println("\n=== RELATÓRIO DE PACIENTES ===");
                    if (pacientes.isEmpty()) {
                        System.out.println("Nenhum paciente cadastrado.");
                    } else {
                        for (int i = 0; i < pacientes.size(); i++) {
                            Paciente p = pacientes.get(i);
                            p.relatorioPaciente();
                        }
                            
                    }

                    System.out.println("\n=== RELATÓRIO DE MÉDICOS ===");
                    if (medicos.isEmpty()) {
                        System.out.println("Nenhum médico cadastrado.");
                    } else {
                        for (int i = 0; i < medicos.size(); i++) {
                            Medico m = medicos.get(i);
                            m.relatorioMedico();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;  

                default:
                    break;
            }

        }while (opcao != 0);

        Paciente paciente1 = new Paciente("Victor", "70630625140", "61999391241", "victor@gmail.com", "particular");
        paciente1.relatorioPaciente();

    }
}