public class Jogo {
    private static Tela[] arrTelas;
    public static void main( String[] args) {
      
        arrTelas = new Tela[] {
            new Menu(), new Fase()
        };

        while(Tela.telaAtual != -1) {
            trocarTela(Tela.telaAtual);
        }

    }

    public static void trocarTela(int i) {
        System.out.println(i);
        if (arrTelas[i].isVisible() == false) {
            for (int j = 0; j < arrTelas.length; j++) {
                arrTelas[j].setVisible(false);
            }
    
            arrTelas[i].setVisible(true);        
        }
    }
}
 //falta o looping do orquestrador na main, botar os actio