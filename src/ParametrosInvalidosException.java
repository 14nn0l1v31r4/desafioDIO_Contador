public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
		super(message); 

	}
	 public String getMessage(){
		return "O segundo parâmetro deve ser maior que o primeiro";
	}
}
