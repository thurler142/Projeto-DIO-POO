package aparelho_telefonico;

public class Aparelho_Telefonico {
    private String ligar;
    private String atender;
    private String iniciarCorreiodeVoz;

    public Aparelho_Telefonico() {
        this.ligar = ligar;
        this.atender = atender;
        this.iniciarCorreiodeVoz = iniciarCorreiodeVoz;
    }

    public void getLigar() {
        System.out.println("Ligando");
    }

    public void getAtender() {
        System.out.println("Atendendo Ligação");
    }

    public void getIniciarCorreiodeVoz() {
        System.out.println("Iniciando Correio de voz");

    }
    public static void main (String [] args){
        Aparelho_Telefonico aparelhoTelefonico = new Aparelho_Telefonico();
        aparelhoTelefonico.getLigar();
        aparelhoTelefonico.getAtender();
        aparelhoTelefonico.getIniciarCorreiodeVoz();

    }
}
