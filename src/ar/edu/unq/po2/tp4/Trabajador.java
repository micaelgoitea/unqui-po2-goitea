package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<IngresoPercibido> ingresosPercibidosDelAņo = new ArrayList<>();
	
	public void agregarIngresoPercibido(IngresoPercibido ingresoPercibido) {
		this.ingresosPercibidosDelAņo.add(ingresoPercibido);
	}
	
	public float getMontoTotalPercibido() {
		float montoTotal = 0;
		for (IngresoPercibido ingreso : ingresosPercibidosDelAņo) {
			montoTotal += ingreso.getMontoPercibido();
		}
		return montoTotal;
	}
	
	public float getMontoTotalImponible() {
		float montoImponibleTotal = 0;
		for (IngresoPercibido ingreso : ingresosPercibidosDelAņo) {
			montoImponibleTotal += ingreso.getMontoImponible();
		}
		return montoImponibleTotal;
	}
	
	public float getImpuestoAPagar() {
		return (float) (this.getMontoTotalImponible() * 0.02);
	}

	public List<IngresoPercibido> getIngresosPercibidosDelAņo() {
		return ingresosPercibidosDelAņo;
	}

	public void setIngresosPercibidosDelAņo(List<IngresoPercibido> ingresosPercibidosDelAņo) {
		this.ingresosPercibidosDelAņo = ingresosPercibidosDelAņo;
	}
	
}