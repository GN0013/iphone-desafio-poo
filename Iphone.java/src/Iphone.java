public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocarMusica(String musica) {
        System.out.println("Tocando a música: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Pausando a música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atenderChamada() {
        System.out.println("Chamada atendida");
    }

    public void iniciarConversaVoz() {
        System.out.println("Iniciando a conversa por voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a página: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocarMusica("Música 1");
        iphone.selecionarMusica("Música 2");
        iphone.pausarMusica();

        iphone.ligar("123-456-789");
        iphone.atenderChamada();
        iphone.iniciarConversaVoz();

        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba("www.google.com");
        iphone.atualizarPagina();
    }
}