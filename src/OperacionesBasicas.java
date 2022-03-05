
public class OperacionesBasicas {
	public double Sumatoria(double Resultado0[]) {
		double SUM = 0;
		for (int M = 0; M < Resultado0.length; M++) {
			SUM = Resultado0[M] + SUM;
		}
		return SUM;
	}
	public double SumatoriaProducto(double Resultado0[], double Resultado1[]) {
		double SUMSUM = 0;
		for (int M = 0; M < Resultado0.length; M++) {
			SUMSUM = (Resultado0[M] * Resultado1[M]) + SUMSUM;
		}
		return SUMSUM;
	}
	public double MediaAritmetica(double Numeros[]) {
		double Media = 0;
		double Num[] = Numeros;
		int Total = Num.length;
		for (int M = 0; M < Total; M++) {
			Media = Num[M] + Media;
		}
		Media = Media / Total;
		return Media;
	}
	public double MediaGeometrica(double Numeros[]) {
		double MediaGeo = 1;
		double Num[] = Numeros;
		int Total = Num.length;
		for (int M = 0; M < Total; M++) {
			MediaGeo = Num[M] * MediaGeo;
		}
		MediaGeo =Math.pow(MediaGeo, (double) 1 / Total);
		return MediaGeo;
	}
	public double MediaArmonica(double Numeros[]) {
		double MediaArm = 0;
		double Num[] = Numeros;
		int Total = Num.length;
		for (int M = 0; M < Total; M++) {
			MediaArm = (1/Num[M] )+ MediaArm;
		}
		
		MediaArm =Total/MediaArm;
		return MediaArm;
	}
	public String Moda (double Numeros[]) {
		String Moda="";
		double Num[]=Numeros;
		int MaxRep=0;
		for(int M=0;M<Num.length; M++) {
			int Rep=0;
			for(int N=0;N<Num.length;N++) {
				if(Num[M]==Num[N]) {
					Rep++;
				}
				if(Rep>MaxRep) {
				Moda=String.valueOf(Num[M]);
				MaxRep=Rep;
				}
			}
		}
		if (MaxRep>1) {
			return Moda;
		}else {
			return "No hay repeticon de numeros por lo tanto no hay Moda";
		}
	}
	public double Mediana (double Numeros[]) {
		double Mediana=0;
		double Num[]=Numeros;
		int Centro=Num.length/2;
		if(Num.length%2==1) {
			Mediana=Num[Centro];
			return Mediana;
		} else {
			return (Num[Centro-1]+Num[Centro])/2;

		}
	}
	public double DesviacionEstandar (double Numeros[]) {
		double Num[]=Numeros;
		double MediaT=MediaAritmetica(Num);
		double Desviacion=0, Temp=0;
		int Total=Num.length;
		for(int M=0;M<Total; M++) {
			Temp=Temp+Math.pow((Num[M]-MediaT),2);
		}
		Desviacion=Temp/(Total-1);
		Desviacion=Math.sqrt(Desviacion);;		
		return Desviacion;
	}
}
