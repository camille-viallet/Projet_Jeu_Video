package Model.loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import Model.automata.Automaton;
import Model.automata.ast.AST;
import Model.automata.creation.AstToObject;
import Model.automata.parser.AutomataParser;

public class AutomataLoader {

	private static AutomataLoader instance = new AutomataLoader();
	private static HashMap<String, Automaton> automata;
	private AstToObject visiteur;

	private AutomataLoader() {
		automata = new HashMap<String, Automaton>();
		visiteur = new AstToObject();
	}

	public static void load(String filename) {
		instance.specific_load(filename);
	}

	private void specific_load(String filename) {
		try {
			AST ast = (AST) AutomataParser.from_file(filename);
			List<Automaton> li = ((List<Automaton>) ast.accept(visiteur));
			String name;
			for (int k = 0 ; k < li.size() ; k ++) {
				name = li.get(k).getName();
				automata.put(name, li.get(k));
			}
		} catch (Exception ex) {
			System.out.println(ex.getCause());
			System.out.println(ex.getClass());
			System.out.println(Arrays.toString(ex.getStackTrace()).replace(',', '\n'));
		}
	}
	
	public static void load_all(String filename) throws IOException {
		instance.specific_load_all(filename);
	}
	
	private void specific_load_all(String filename) throws IOException {
		FileReader file = new FileReader(filename);
		BufferedReader br = new BufferedReader(file);
		String line;
		while((line = br.readLine()) != null) {
			specific_load(line);
		}
	}
	
	public static HashMap<String, Automaton> get_list(){
		return automata;
	}

}
