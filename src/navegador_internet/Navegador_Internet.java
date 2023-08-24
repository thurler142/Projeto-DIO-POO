package navegador_internet;

public class Navegador_Internet {
    private String exibirPagina;
    private String adicionarNovaAba;
    private String atualizarPagina;

    public Navegador_Internet() {
        this.exibirPagina = exibirPagina;
        this.adicionarNovaAba = adicionarNovaAba;
        this.atualizarPagina = atualizarPagina;
    }

    public void getExibirPagina() {
        System.out.println("Exibindo Pagina na Tela");
    }

    public void getAdicionarNovaAba() {
        System.out.println("Adicionando Pagina na Tela");
    }

    public void getAtualizarPagina() {
        System.out.println("Atualizando Pagina na Tela");
    }
    public static void main (String [] args){
        Navegador_Internet navegadorInternet = new Navegador_Internet();
        navegadorInternet.getAdicionarNovaAba();
        navegadorInternet.getAtualizarPagina();
        navegadorInternet.getExibirPagina();

;

    }
}

