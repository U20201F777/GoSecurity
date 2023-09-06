package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idNotificación;
   @ManyToOne
   @JoinColumn(name = "idAyuda")
   private Ayuda idAyuda;
   @ManyToOne
   @JoinColumn(name = "idTipoCaso")
   private TipoCaso idTipoCaso;

    public Notificacion() {
    }

    public Notificacion(int idNotificación, Ayuda idAyuda, TipoCaso idTipoCaso) {
        this.idNotificación = idNotificación;
        this.idAyuda = idAyuda;
        this.idTipoCaso = idTipoCaso;
    }

    public int getIdNotificación() {
        return idNotificación;
    }

    public void setIdNotificación(int idNotificación) {
        this.idNotificación = idNotificación;
    }

    public Ayuda getIdAyuda() {
        return idAyuda;
    }

    public void setIdAyuda(Ayuda idAyuda) {
        this.idAyuda = idAyuda;
    }

    public TipoCaso getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(TipoCaso idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }
}
