
/**
 * @author Xavier Navarro
 *
 */



public class Cotxe {
	String marca;
	String model;
	int cilindrada;
	int cilindres;
	double potenciaFiscal;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPotencia() {
		return cilindres;
	}
	public void setPotencia(int potencia) {
		this.cilindres = potencia;
	}
	public double getPotenciaFiscal() {
		return potenciaFiscal;
	}
	public void setPotenciaFiscal(double potenciaFiscal) {
		this.potenciaFiscal = potenciaFiscal;
	}
	public void calculaPotenciaFiscal(int cilindres, int cilindrada) {
		double temp = 0.08 * cilindres * Math.pow((cilindrada / cilindres),0.6);
		setPotenciaFiscal(temp);
	}
	
}
