package br.com.leandrosenazuza.modelo;

import javax.persistence.*;

@Entity
public class Planta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_Planta")
    private Long id;
    private String name;    
    private String specie;
    private Long codSectorHome; // Em qual setor da casa se encaixa

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public Long getCodSectorHome() {
        return codSectorHome;
    }

    public void setCodSectorHome(Long codSectorHome) {
        this.codSectorHome = codSectorHome;
    }
}
