public class Main {
    public static void main(String[] args) {
        // Criando um objeto iPhone
        iPhone meuIphone = new iPhone();
        
        // Testando os métodos do Reprodutor Musical
        System.out.println("Testando Reprodutor Musical:");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        
        // Testando os métodos do Aparelho Telefônico
        System.out.println("\nTestando Aparelho Telefônico:");
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando os métodos do Navegador na Internet
        System.out.println("\nTestando Navegador na Internet:");
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
