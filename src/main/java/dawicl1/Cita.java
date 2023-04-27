package dawicl1;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the citas database table.
 * 
 */
@Entity
@Table(name="citas")
@NamedQuery(name="Cita.findAll", query="SELECT c FROM Cita c")
public class Cita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cita")
	private int idCita;

	@Column(name="fecha_cita")
	private String fechaCita;

	@Column(name="nom_paciente_cita")
	private String nomPacienteCita;

	@Column(name="num_cita")
	private int numCita;

	//bi-directional many-to-one association to Doctor
	@ManyToOne
	@JoinColumn(name="id_doctor")
	private Doctor doctor;

	public Cita() {
	}

	public int getIdCita() {
		return this.idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public String getFechaCita() {
		return this.fechaCita;
	}

	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}

	public String getNomPacienteCita() {
		return this.nomPacienteCita;
	}

	public void setNomPacienteCita(String nomPacienteCita) {
		this.nomPacienteCita = nomPacienteCita;
	}

	public int getNumCita() {
		return this.numCita;
	}

	public void setNumCita(int numCita) {
		this.numCita = numCita;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	
	
	

}