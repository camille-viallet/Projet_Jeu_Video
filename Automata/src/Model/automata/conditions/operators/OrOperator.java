package Model.automata.conditions.operators;

import Model.automata.conditions.Condition;
import Model.entities.Entity;

public class OrOperator extends Condition{
	//on utilise des operateurs ici à gauche et à droite
		public Condition condDroite;
		public Condition condGauche;
		
		public OrOperator(Object condDroite, Object condGauche) throws Exception {
			super();
			try {
			this.condDroite = (Condition) condDroite;
			this.condGauche = (Condition) condGauche;
			}catch(Exception e) {
				System.out.println("Erreur de changement de type de variable");
				throw new Exception("Erreur, in orOperator");
			}
		}

		@Override
		public boolean eval(Entity entity) {
			return (condDroite.eval(entity) || condGauche.eval(entity));
		}

		
}
