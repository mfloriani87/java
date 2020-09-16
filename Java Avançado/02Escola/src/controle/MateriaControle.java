package controle;

import javax.swing.DefaultComboBoxModel;

import modelo.MateriaModelo;

public class MateriaControle {
	
	// Método para retornar um conjunto de marcas
	public static DefaultComboBoxModel<MateriaModelo> listar(){
		
		// Objetos da classe MarcaModelo
		MateriaModelo obj1 = new MateriaModelo("Física");
		MateriaModelo obj2 = new MateriaModelo("Geografia");
		MateriaModelo obj3 = new MateriaModelo("Matemática");
		MateriaModelo obj4 = new MateriaModelo("Português");
		MateriaModelo obj5 = new MateriaModelo("Química");
		
		// DefaultComboBoxModel
		DefaultComboBoxModel<MateriaModelo> lst = new DefaultComboBoxModel<MateriaModelo>();
		lst.addElement(obj1);
		lst.addElement(obj2);
		lst.addElement(obj3);
		lst.addElement(obj4);
		lst.addElement(obj5);
		
		// Retorno
		return lst;
		
	}

}








