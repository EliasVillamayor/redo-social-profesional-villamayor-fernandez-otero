package redsocialprofesional;

public interface IUsuario {

    void publicarOferta(Oferta oferta);

    void postularOferta(Oferta oferta);

    String getNombre();

    Oferta[] getOfertasPublicadas();

    Oferta[] getOfertasPostuladas();

    int getCantPublicadas();

    int getCantPostuladas();
}
