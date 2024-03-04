package src;

public class Bordado {
    public int id;
    public int linhas;
    public int colunas;

    public char[][] pontos;
    public int numeroPontos;

    Bordado(int id, int linhas, int colunas) {
        this.id = id;
        this.linhas = linhas;
        this.colunas = colunas;
        this.pontos = new char[linhas][colunas];
        this.numeroPontos = 0;        

        // Inciializa os pontos do bordado com espaços 
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                this.pontos[i][j] = ' ';
            }
        }
    }

    public void adicionarPonto(int linha, int coluna, char ponto) {
        if (ponto == ' ') {
            this.numeroPontos--;
        } else if (this.pontos[linha][coluna] == ' ') {
            this.numeroPontos++;
        }
        this.pontos[linha][coluna] = ponto;
    }
}
