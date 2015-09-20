
public class CotxeHibrid extends Cotxe {
	int potMotElec;
	
	public int getPotMotElec() {
		return potMotElec;
	}

	public void setPotMotElec(int potMotElec) {
		this.potMotElec = potMotElec;
	}

    public void calculaPotenciaFiscal(int cilindres, int cilindrada, int kW) {
		double temp = 0.08 * cilindres * Math.pow((cilindrada / cilindres),0.6) * (kW/200.0);
		setPotenciaFiscal(temp);
	}
}
