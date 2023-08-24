package reprodutor_musical;

public class Reprodutor_Musical {

    private String tocar;
    private String pausar;

    private String selecionarMusica;

    public Reprodutor_Musical() {
        this.tocar = tocar;
        this.pausar = pausar;
        this.selecionarMusica = selecionarMusica;
    }

    public void getTocar() {
        System.out.println("Tocando musica");
    }

    public void getPausar() {
        System.out.println("Pausando Musica");
    }

    public void getSelecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    @Override
    public String toString() {
        return "Reprodutor_Musical{" +
                "tocar='" + tocar + '\'' +
                ", pausar='" + pausar + '\'' +
                ", selecionarMusica='" + selecionarMusica + '\'' +
                '}';
    }

    public static void main (String [] args){
        Reprodutor_Musical reprodutorMusical = new Reprodutor_Musical();
        reprodutorMusical.getTocar();
        reprodutorMusical.getPausar();
        reprodutorMusical.getSelecionarMusica();
    }
}
