public class Triangle implements MyShape{

	double b;
	public double Area(double b){
		this.b=b;

		return ((Math.sqrt(3))/2)*b*b;

	}

	public double boundary_length(double b){
		this.b=b;

		return 3*b;
	
	}

}