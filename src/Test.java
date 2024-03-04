package src;

public class Test {
    public static void main(String[] args) {
        System.out.println("Testes Comecado...");

        MenuBordados mb = new MenuBordados();
    
        mb.cadastrarBordado(0, 5, 5);
        mb.atualizarBordado(0, 0, 0, 'x');
        mb.atualizarBordado(0, 0, 1, '\\');
        mb.atualizarBordado(0, 0, 2, '|');
        mb.atualizarBordado(0, 0, 3, '/');
        
        mb.imprimirBordado(0);

        System.out.println("-------------------");
        
        try {
            mb.imprimirBordado(1);
        } catch(Error e) {
            System.out.println("Error!"); // Error
            System.out.println("-------------------");

        }

        try {
            mb.cadastrarBordado(1, 1, 1);
        } catch(Error e) {
            System.out.println("Error!"); // Error
            System.out.println("-------------------");

        }

        try {
            mb.cadastrarBordado(1, 101, 101);
        } catch(Error e) {
            System.out.println("Error!"); // Error
            System.out.println("-------------------");

        }


        mb.cadastrarBordado(1, 5, 5);
        mb.atualizarBordado(1, 2, 2, 'x');
        mb.alterarTamanhoDoBordado(1, 3, 3);

        mb.imprimirBordado(1);
        System.out.println("-------------------");


        mb.cadastrarBordado(2, 2, 2);
        mb.imprimirBordado(2);

        System.out.println("-------------------");


        mb.alterarTamanhoDoBordado(2, 5, 5);
        mb.imprimirBordado(2);

        System.out.println("-------------------");


        mb.cadastrarBordado(2, 2, 2);
        mb.atualizarBordado(2, 1, 1, 'x');
        mb.imprimirBordado(2);

        System.out.println("-------------------");


        mb.alterarTamanhoDoBordado(2, 5, 5);
        mb.imprimirBordado(2);

        mb.cadastrarBordado(8, 2, 2);
        System.out.println("-------------------");

        mb.listarBordados();

        System.out.println("-------------------");
    }
}
