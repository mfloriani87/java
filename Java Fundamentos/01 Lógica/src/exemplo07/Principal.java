package exemplo07;

public class Principal {

	public static void main(String[] args) {
	
		/*
		 	&   E   (Executa obrigatóriamente todas as verificações)
		 	&&  E   (Assim que encontrar algo falso, pára de verificar)
		 	|   OU  (Executa obrigatóriamente todas as verificações)
		 	||  OU  (Assim que encontrar algo falso, pára de verificar)
		 	^   XOR (Precisa haver uma verificação falsa e outra verdadeira)
		*/
		
		double media = 8;
		int faltas = 7;
		
		if(media >= 7 && faltas <= 10) {
			System.out.println("Aprovado(a)");
		}else {
			System.out.println("Reprovado(a)");
		}
		
	}

}
