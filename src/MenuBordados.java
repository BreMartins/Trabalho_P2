package src;

public class MenuBordados {
    Bordado[] bordados;

    MenuBordados() {
        this.bordados = new Bordado[10];
    }

    public void registrarBordado(int id, int linhas, int colunas) {
        Bordado bordado = new Bordado(id, linhas, colunas);
        bordados[id] = bordado;
    }
}
