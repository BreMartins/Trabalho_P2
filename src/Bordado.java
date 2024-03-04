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
        this.pontos = this.inicializarBordado(linhas, colunas);
    }

    private char[][] inicializarBordado(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;


        char[][] novoBordado = new char[linhas][colunas];

        // Inciializa os pontos do bordado com espaços 
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                novoBordado[i][j] = ' ';
            }
        }
        return novoBordado;
    }

    public void adicionarPonto(int linha, int coluna, char ponto) {
        if (ponto == ' ') {
            this.numeroPontos--;
        } else if (this.pontos[linha][coluna] == ' ') {
            this.numeroPontos++;
        }
        this.pontos[linha][coluna] = ponto;
    }

    public void redimensionar(int linha, int coluna){
        
        // Previne Array Index out of Bounce Error:
        int l = Integer.min(linha, this.linhas);
        int c = Integer.min(coluna, this.colunas);

        int numeroDePontos = 0;


        // Verifica se o redimensionamento removeu algum ponto
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (this.pontos[i][j] != ' ') {
                    numeroDePontos++;
                }
            }
        }
        
        if (this.numeroPontos != numeroDePontos) {
            // Significa que o redimensionamento removeu algum ponto
            throw new Error();
        }

        this.linhas = linha;
        this.colunas = coluna;
        
        char[][] novoBordado = this.inicializarBordado(linha, coluna);

        // Mapeia os pontos do antigo bordado para o novo
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                novoBordado[i][j] = this.pontos[i][j];
            }
        }

        this.pontos = novoBordado;
    }
}
