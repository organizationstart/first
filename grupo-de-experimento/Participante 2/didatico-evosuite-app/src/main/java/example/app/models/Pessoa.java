package example.app.models;

public class Pessoa {
    /** Nome da pessoa */
    protected String nome;
    /** Idade da pessoa */
    protected int idade;
    
    /**
     * Método construtor
     * @param nome
     * @param idade
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    /**
     * Busca o nome da pessoa
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
        System.out.println(nome);
    }

    /**
     * Busca a idade da pessoa
     * @return
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade da pessoa
     * @param idade
     */
    public void setIdade(int idade) {
    	if (idade <= 0) {
    		System.out.println("Idade Inválida.");
    	} else {
    		this.idade = idade;
            System.out.println(idade);
    	}
        
    }

    
}
