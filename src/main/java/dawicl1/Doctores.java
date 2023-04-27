package dawicl1;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the doctores database table.
 * 
 */
@Entity
@Table(name="doctores")
@NamedQuery(name="Doctores.findAll", query="SELECT d FROM Doctores d")
public class Doctores implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_doctor")
	private int idDoctor;

	@Column(name="especialidad_doctor")
	private String especialidadDoctor;

	@Column(name="nom_doctor")
	private String nomDoctor;

	//bi-directional many-to-one association to Cita
	@OneToMany(mappedBy="doctores")
	private List<Cita> citas;

	public Doctores() {
	}

	public int getIdDoctor() {
		return this.idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getEspecialidadDoctor() {
		return this.especialidadDoctor;
	}

	public void setEspecialidadDoctor(String especialidadDoctor) {
		this.especialidadDoctor = especialidadDoctor;
	}

	public String getNomDoctor() {
		return this.nomDoctor;
	}

	public void setNomDoctor(String nomDoctor) {
		this.nomDoctor = nomDoctor;
	}

	public List<Cita> getCitas() {
		return this.citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Cita addCita(Cita cita) {
		getCitas().add(cita);
		cita.setDoctores(this);

		return cita;
	}

	public Cita removeCita(Cita cita) {
		getCitas().remove(cita);
		cita.setDoctores(null);

		return cita;
	}

}