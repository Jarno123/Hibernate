package domain;

import javax.persistence.*;

@Entity
@Table(name = "Werknemer")
public class Werknemer {

    @Id
    @Column(name = "Code")
    private String code;

    @Column(name = "naam")
    private String naam;

    @Column(name = "adres")
    private String adres;

    @Column(name = "chef")
    private String chef;

    @Column(name = "sal")
    private int sal;

    @Column(name = "Datum_in_dienst")
    private String datumInDienst;
    
    @Column(name = "postcode")
    private String postcode;


    public Werknemer(String code, String naam,String adres, String chef, int sal, String datumInDienst,
            String postcode) {
        this.code = code;
        this.naam = naam;
        this.adres = adres;
        this.chef = chef;
        this.sal = sal;
        this.datumInDienst = datumInDienst;
        this.postcode = postcode;
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getChef() {
		return chef;
	}

	public void setCheff(String chef) {
		this.chef = chef;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDatumInDienst() {
		return datumInDienst;
	}

	public void setDatumInDienst(String datumInDienst) {
		this.datumInDienst = datumInDienst;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}