public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private String urlAtual;


    public static void main(String[] args) {
        iPhone phone = new iPhone();

        phone.selecionarMusica("Ela Partiu");
        phone.tocar();
        phone.pausar();

        phone.fazerLigacao("9965238759");
        phone.atenderChamada();
        phone.iniciarCorreioDeVoz();

        phone.exibirPagina("https://dio.me");
        phone.novaAba();
        phone.atualizarPagina();
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Faixa selecionada: " + musica);
    }


    @Override
    public void fazerLigacao(String number) {
        System.out.println("Ligando para " + number + "...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando MailVoice");
    }


    @Override
    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void novaAba() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }


}