package redsocialprofesional;

public class Oferta implements IOferta {

    private String titulo;
    private String descripcion;
    private Usuario publicadaPor;

    public Oferta(String titulo, String descripcion, Usuario publicadaPor) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.publicadaPor = publicadaPor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public Usuario getPublicadaPor() {
        return publicadaPor;
    }

    @Override
    public String toString() {
        return titulo + " - " + publicadaPor.getNombre();
    }
}
