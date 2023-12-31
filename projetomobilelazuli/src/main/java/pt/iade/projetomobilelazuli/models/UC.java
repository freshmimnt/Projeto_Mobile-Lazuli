package pt.iade.projetomobilelazuli.models;

import jakarta.persistence.*;

@Entity
@Table(name = "UC")
public class UC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UC_id", nullable = false)
    private int id;

    @Column(name = "UC_name", nullable = false)
    private String name;

    @Column(name = "UC_sala")
    private String sala;

    @Column(name = "UC_prof")
    private String prof;

    @Column(name = "UC_desc")
    private String desc;

    @Column(name = "media_nota")
    private float media;

    @ManyToOne
    @JoinColumn(name = "UC_cour_id", referencedColumnName = "cour_id" )
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "UC_user_id", referencedColumnName = "user_id" )
    private User user;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public Curso getCurso() {return curso;}

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public User getUtilizador() {return user;}

    public void setUtilizador(User user) {
        this.user = user;
    }
}
