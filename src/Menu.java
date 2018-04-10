import java.util.List;

public class Menu extends Action {
	
	private String titulo;
	private String opcao;
	private String erro;
	private List<Action> actions;
	
	
	
	
	
	
	/**
	 * @param título
	 * @param opcao
	 * @param erro
	 * @param actions
	 */
	public Menu(String título, String opcao, String erro, List<Action> actions) {
		super();
		this.titulo = título;
		this.opcao = opcao;
		this.erro = erro;
		this.actions  = actions;
	}
	
	public Menu( String opcao, String erro, List<Action> actions) {
		super();
		this.opcao = opcao;
		this.erro = erro;
		this.actions = actions;
		
		this.titulo = null;
	}
	
	public Menu(String erro, List<Action> actions) {
		super();
		this.erro = erro;
		this.actions = actions;

		this.titulo = null;
		this.opcao = null;
		
	}
	

	public void function() {
		
	}
	
	public void escolherAcao() {
		
	}
	
	public void exibErro() {
		
	}
	
}
