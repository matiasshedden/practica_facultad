package practico8.SitioDeNoticias;

public class main {
    public static void main (String[] args) {
        repo n1 = new Noticia("Milei arriba", "Milei", "Arriba en las encuestas",
                "ASi lo dice las ultimas encuestas","Clarin", "www.clarin.com.ar");
        repo n2 = new Noticia("Chau pichu", "Fallecio la perra", "tenia 20 años",
                "No aguanto tantos años", "Cualquiera", "www.cualquiera.com.ar");
        compuesto C = new compuesto("categoria", "noticias sin sentido", "xxx.png");
        compuesto C1 = new compuesto("categoria2", "noticias sin sentido2", "xxx2.png");
        C.addElemento(C1);
        C.addElemento(n1);
        C.addElemento(n2);
        System.out.println("Repositorio C");
        System.out.println(C.listar_sitio());
        System.out.println("Repositorio C1");
        System.out.println(C1.listar_sitio());//No separa los nombres de cada categoria
    }
}
