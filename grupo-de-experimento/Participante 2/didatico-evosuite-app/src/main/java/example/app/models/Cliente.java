package example.app.models;

public class Cliente extends Pessoa {

    protected String email;
    protected String fone;
    protected Carteira carteira;

    /**
     * Método construtor
     * @param nome
     * @param idade
     * @param email
     * @param fone
     */
    public Cliente(String nome, int idade, String email, String fone) {
        super(nome, idade);
        this.email = email;
        this.fone = fone;
    }

    
    /**
     * Método construtor que recebe a carteira
     * @param nome
     * @param idade
     * @param email
     * @param fone
     * @param carteira
     */
    public Cliente(String nome, int idade, String email, String fone, Carteira carteira) {
        super(nome, idade);
        this.email = email;
        this.fone = fone;
        this.carteira = carteira;
    }


    /**
     * Retorna o email do cliente
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do cliente
     * @param email
     */
    public void setEmail(String email) {
    	
	    for (int i=0; i<email.length(); i++) {
	    	char c = email.charAt(i);
	    	//System.out.println(c);
		    	if (c == '!') {
		    		System.out.printf("O seguinte caracter " + c + " foi identificado na posição de índice %d\n Digite um email válido.\n", email.indexOf(c));
		    	break;	
		    	}else {
		    		System.out.println("Email cadastrado: " + email);
		    	break;	
		    	}
		    	}
	    }
    

    /**
     * Busca o telefone do cliente
     * @return
     */
    public String getFone() {
        return fone;
    }

    /**
     * Define o telefone do cliente
     * @param fone
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * Busca a carteira do cliente
     * @return
     */
    public Carteira getCarteira() {
        return carteira;
    }

    /**
     * Define a carteira do cliente
     * @param carteira
     */
    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }


}
