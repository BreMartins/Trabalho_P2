package src;

public class MenuBordados {
    Bordado[] bordados;

    MenuBordados() {
        this.bordados = new Bordado[10];
    }

    public void cadastrarBordado(int id, int linhas, int colunas) throws Error{

        if (id < 0 || id > 9) {
            throw new Error();
        }

        if (linhas < 1 || colunas < 1 || linhas > 100 || colunas > 100) {
            throw new Error();
        }

        Bordado bordado = new Bordado(id, linhas, colunas);
        bordados[id] = bordado;
    }

    public void atualizarBordado(int id, int bordadoLinha, int bordadoColuna, char ponto) {

        Bordado bordado = this.bordados[id];
        
        if (bordado == null) {
            throw new Error();
        }

        int cols = bordado.colunas;
        int rows = bordado.linhas;


        if (bordadoLinha < 0 || bordadoLinha >= rows || bordadoColuna < 0 || bordadoColuna >= cols) {
            throw new Error();
        }

        if (ponto != '/' && ponto != '\\' && ponto != '|' && ponto != '-' && ponto != 'x' && ponto != ' ') {
            throw new Error();
        }

        this.bordados[id].adicionarPonto(bordadoLinha, bordadoColuna, ponto);
    }

    public void imprimirBordado(int id) throws Error {
        Bordado bordado = this.bordados[id];
        
        if (bordado == null) {
            throw new Error();
        }

        int cols = bordado.colunas;
        int rows = bordado.linhas;

        System.out.print('|');
        for (int i = 0; i < cols; i++) {
            System.out.print('-');
        }
        System.out.println('|');

        for (int i = 0; i < cols; i++) {
            System.out.print('|');

            for (int j = 0; j < rows; j++) {
                System.out.print(bordado.pontos[i][j]);
            }

            System.out.println('|');
        }
    }
    
    public void ListarBordados() {
        for (int i = 0; i < 10; i++) {
            if (this.bordados[i] != null ) {
                System.out.println(
                    i + " - " +
                    this.bordados[i].linhas  + " x " + 
                    this.bordados[i].colunas + " - " +
                    this.bordados[i].numeroPontos + " pontos"
                );
            }
        }
    }
}
