package it.polito.tdp.extflightdelays.model;

public class Tratta {
	
	private String s1;
	private String s2;
	private int velivoli;
	
	
	public Tratta(String s1, String s2, int velivoli) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.velivoli = velivoli;
	}


	public String getS1() {
		return s1;
	}


	public void setS1(String s1) {
		this.s1 = s1;
	}


	public String getS2() {
		return s2;
	}


	public void setS2(String s2) {
		this.s2 = s2;
	}


	public int getVelivoli() {
		return velivoli;
	}


	public void setVelivoli(int velivoli) {
		this.velivoli = velivoli;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s1 == null) ? 0 : s1.hashCode());
		result = prime * result + ((s2 == null) ? 0 : s2.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tratta other = (Tratta) obj;
		if (s1 == null) {
			if (other.s1 != null)
				return false;
		} else if (!s1.equals(other.s1))
			return false;
	
		return true;
	}
	
	

}
