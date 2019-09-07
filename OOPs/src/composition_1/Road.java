package composition_1;

class Road 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ClockTower ct = new ClockTower("hyd", new Clock(11,5,19));
		ct.showTime();
	}

}
