
public class Application {
	public static void main(String args[]) {
		int[] vetor= {1,2,3,4,5,6};
		int retorno = buscabinaria(vetor, 20);
		System.out.println(retorno);
	
		
	}
	
	public static int buscabinaria(int v[],int valorBuscado) {
		int inicio,meio,fim;
		inicio=0;
		fim=v.length-1;
		meio=(inicio+fim)/2;
		while((v[meio]!=valorBuscado) && (inicio<fim)){
			if(v[meio]<valorBuscado) {
				inicio=meio+1;
			}
			else{
				fim=meio-1;
			}
				meio=(inicio+fim)/2;
		}
		if(inicio>=fim) {
			if(v[fim]==valorBuscado) {
				meio=fim;
			}else {
				meio=-1;
			}
		}
		return meio;
	}
}
