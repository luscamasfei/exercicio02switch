import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opcao, profissao;

        opcao = JOptionPane.showInputDialog(
                "Informe a profissão do Tibúrcio:\n"
                + "e - engenheiro\n"
                + "m - médico\n"
                + "d - designer\n"
                + "p - programador\n"
                + "a - advogado");

        switch (opcao) {
            case "e":
                profissao = "engenheiro";
                break;
            case "m":
                profissao = "médico";
                break;
            case "d":
                profissao = "designer";
                break;
            case "p":
                profissao = "programador";
                break;
            case "a":
                profissao = "advogado";
                break;
            default:
                profissao = "DESEMPREGADO";
        }

        JOptionPane.showMessageDialog(null, "Tibúrcio é " + profissao);
    }
}