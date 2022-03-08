package city_company.example.city_company.entities;

import java.time.Instant;
import java.util.Objects;

public class SeguroCarro {
	
	private Long id;
    private Instant moment;
	
    public SeguroCarro() {
    }

	public SeguroCarro(Long id, Instant moment) {
		super();
		this.id = id;
		this.moment = moment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeguroCarro other = (SeguroCarro) obj;
		return Objects.equals(id, other.id);
	}
    
    

}
