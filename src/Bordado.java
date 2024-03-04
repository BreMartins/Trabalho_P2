package src;

public class Bordado {
    public int id;
    public int linhas;
    public int colunas;

    public char[][] bordado;

    Bordado(int id, int linhas, int colunas) {
        this.id = id;
        this.linhas = linhas;
        this.colunas = colunas;
        this.bordado = new char[linhas][colunas];
    }

    public void adicionarPonto(int linha, int coluna, char ponto) {
        this.bordado[linha][coluna] = ponto;
    }
}
