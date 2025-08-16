package feature.models;

import java.time.LocalDateTime;

public class Transaction {
    private Integer id;
    private String nombre;
    private Double monto;
    private LocalDateTime fecha;
    private String tipoPago;
    private String categoria;
    private String lugar;

    public Transaction(int i, String s, double v){
    }

    public Transaction(Integer id, String nombre, Double monto, LocalDateTime fecha, String tipoPago, String categoria, String lugar) {
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
        this.fecha = fecha;
        this.tipoPago = tipoPago;
        this.categoria = categoria;
        this.lugar = lugar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
