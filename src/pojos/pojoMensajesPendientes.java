package pojos;
public class pojoMensajesPendientes 
{
    private double idMensaje;
    private String remitente;
    private String destinatario;
    private String fechayhora;

    public pojoMensajesPendientes() {
    }

    public pojoMensajesPendientes(double idMensaje, String remitente, String destinatario, String fechayhora) {
        this.idMensaje = idMensaje;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fechayhora = fechayhora;
    }

    public double getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(double idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(String fechayhora) {
        this.fechayhora = fechayhora;
    }
}