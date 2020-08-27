public class Circle implements MyShape{

	double r;
	public double Area(double r){
		this.r=r;

		return 3.1416*r*r;

	}

	
	public double boundary_length(double r){
		this.r=r;

		return 2*3.1416*r;

	
	}



}