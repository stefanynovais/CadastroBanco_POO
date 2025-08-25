

import telas.Janela;
import funções.CadastroController;

public class Main {
    public static void main(String[] args) {
        CadastroController controller = new CadastroController();
        Janela janela = new Janela(controller);
        janela.setVisible(true);
    }
}
