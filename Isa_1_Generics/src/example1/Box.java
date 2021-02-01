package example1;

public class Box <T,E> {
	
	private T variable;
	private E eVariable;

	
	public Box(T variable, E eVariable) {
		this.variable = variable;
		this.eVariable = eVariable;
	}
		
	public void getInfo() {
		System.out.println(variable.getClass().getSimpleName());
		System.out.println(eVariable.getClass().getSimpleName());
	}
		
	public T getVariable() {
		return variable;
	}
	public void setVariable(T variable) {
		this.variable = variable;
	}
	public E geteVariable() {
		return eVariable;
	}
	public void seteVariable(E eVariable) {
		this.eVariable = eVariable;
	}
	
	
	

}
