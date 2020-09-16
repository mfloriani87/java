package controle;

import javax.swing.table.DefaultTableModel;

import modelo.AlunoModelo;

public class AlunoControle {
	
	// Retornar um conjunto de produtos
	public static DefaultTableModel listar(){

		AlunoModelo pm1 = new AlunoModelo("Juliana", "Química", 8);
		AlunoModelo pm2 = new AlunoModelo("Pablo", "Física", 7);
		
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("Nome");
		dtm.addColumn("Matéria");
		dtm.addColumn("Nota");
		
		dtm.addRow(new Object[] {
				pm1.getNome(), 
				pm1.getMateria(), 
				pm1.getNota()
		});
		
		dtm.addRow(new Object[] {
				pm2.getNome(), 
				pm2.getMateria(), 
				pm2.getNota()
		});
		
		return dtm;
		
	}

}






