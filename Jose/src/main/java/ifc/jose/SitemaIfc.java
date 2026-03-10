package ifc.jose;

public class SitemaIfc {

    public static void main(String[] args) {
        Estudante camada = new Estudante();
        Estudante joao = new Estudante();
        Estudante geovanni = new Estudante();

        camada.setNome("José");
        joao.setNome("João");
        geovanni.setNome("Geovanni");

        System.out.println(camada.getNome());
        System.out.println(joao.getNome());
        System.out.println(geovanni.getNome());
    }
}
