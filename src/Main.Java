import src.telas.Janela;

public class Main {
    public static void main(String[] args) {
        CadastroController controller = new CadastroController();
        Janela janela = new Janela(controller);
        janela.setVisible(true);
    }
}
