package toStringOverriding;

public class Bus 
{
	String an;
	String bp;
	String dp;
	String rn;
	double m;
	public Bus(String an, String bp, String dp, String rn, double m)
	{
		this.an = an;
		this.bp = bp;
		this.dp = dp;
		this.rn = rn;
		this.m = m;
	}
	
	
	@Override	//TODO override annotation
	public String toString()
	{
		return "Welcome to "+this.an+ " Travels please be at your boarding point "+this.bp+" before 15mins your bus reg. number is "+rn;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Bus b = (Bus) obj;
		return (this.m == b.m);
	}
}
