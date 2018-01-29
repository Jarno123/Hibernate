package domain;

import javax.persistence.*;

@Entity
@Table(name = "Project")
public class Project {

    @Id
    @Column(name = "p_code", length = 4)
    private String code;
    
    @ManyToOne
    @JoinColumn(name = "p_leider",foreignKey=@ForeignKey(name="p_leiderFK"))
    private Werknemer leider;

    @Column(name = "p_name")
    private String naam;

    @Column(name = "locatie")
    private String locatie;

    @Column(name = "Start_Datum")
    private String Date;

    @Column(name = "budget")
    private int budget;

    
    public Project() {

    }

    public Project(String code, Werknemer leider, String naam, String locatie, String Date, int budget) {
        this.code = code;
        this.leider = leider;
        this.naam = naam;
        this.locatie = locatie;
        this.Date = Date;
        this.budget = budget;
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Werknemer getP_leider() {
		return leider;
	}

	public void setP_leider(Werknemer p_leider) {
		this.leider = p_leider;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}
}