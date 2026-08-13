package co.edu.sena.inventario.model;

public class Municipio {
    

    private Long id;
    private String nombre;
    private String departamento;

    public Municipio(Long id, String nombre, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }
    
}
