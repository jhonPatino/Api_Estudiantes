package com.sv.modelos;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name="matter" , catalog="materias", schema="")
	public class Matter {

		@Id
		@Column
		private String code;
		@Column 
		private String description;
		@Column 
		private String credits;
		@ManyToOne( fetch = FetchType.LAZY )
		private User user;
		

		public Matter(String code, String description, String credits) {
			super();
			this.code = code;
			this.description = description;
			this.credits = credits;
			user.addMatter(this);
		}
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getCredits() {
			return credits;
		}
		public void setCredits(String credits) {
			this.credits = credits;
		}
}
	
