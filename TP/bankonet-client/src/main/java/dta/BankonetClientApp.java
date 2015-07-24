package dta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

import org.reflections.Reflections;

import dta.ihm.Action;
import dta.ihm.ScannerUtil;

public class BankonetClientApp {

	 public static void main(String[] args) {
		 
		 Reflections reflections = new Reflections("dta");
		 
		 Set<Class<? extends Action>> subTypes = reflections.getSubTypesOf(Action.class);
	 
		 Comparator<Action> comparator = new Comparator<Action>() {
			 	public int compare(Action o1, Action o2) {
			 		return o1.getId().compareTo(o2.getId());
			 	}
		 };
		 
		 ArrayList<Action> listeInstance = new ArrayList<Action>();
		 
		 for (Class<? extends Action> subType : subTypes){
			
			try {
				Action newInstance = subType.newInstance();
				listeInstance.add(newInstance);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 }
		Collections.sort(listeInstance, comparator);
		
		for (Action instance : listeInstance)
		{
			System.out.println(instance.getId().toString() +" "+ instance.getMenu());
		}
		
		Integer choice = ScannerUtil.getInstance().askUserInt("saisir votre choix "); // privilégier 1 singleton pour le scanner (1 seul scanner pour toute l'applicatuion) // en JEE : utiliser les CDI.
	
		for (Action instance : listeInstance )
		{
			if (choice == instance.getId())
			{
				instance.execute();
			}
		}
		
		
	 }	  
}
