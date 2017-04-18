
public enum City 
{
	ALGIERS(Color.BLACK),
	ATLANTA(Color.BLUE),
	BAGHDAD(Color.BLACK),
	BANGKOK(Color.RED),
	BEIJING(Color.RED),
	BOGOTA(Color.YELLOW),
	BUENOS_AIRES(Color.YELLOW),
	CAIRO(Color.BLACK),
	CHENNAI(Color.BLACK),
	CHICAGO(Color.BLUE),
	DELHI(Color.BLACK),
	ESSEN(Color.BLUE),
	HO_CHI_MINH_CITY(Color.RED),
	HONG_KONG(Color.RED),
	ISTANBUL(Color.BLACK),
	JAKARTA(Color.RED),
	JOHANNESBURG(Color.YELLOW),
	KARACHI(Color.BLACK),
	KHARTOUM(Color.YELLOW),
	KINSHASA(Color.YELLOW),
	KOLKATA(Color.BLACK),
	LAGOS(Color.RED),
	LIMA(Color.YELLOW),
	LONDON(Color.BLUE),
	LOS_ANGELES(Color.YELLOW),
	MADRID(Color.BLUE),
	MANILA(Color.RED),
	MEXICO_CITY(Color.YELLOW),
	MIAMI(Color.YELLOW),
	MILAN(Color.BLUE),
	MONTREAL(Color.BLUE),
	MOSCOW(Color.BLACK),
	MUMBAI(Color.BLACK),
	NEW_YORK(Color.BLUE),
	OSAKA(Color.RED),
	PARIS(Color.BLUE),
	RIYADH(Color.BLACK),
	SAN_FRANCISCO(Color.BLUE),
	SANTIAGO(Color.YELLOW),
	SAO_PAULO(Color.YELLOW),
	SEOUL(Color.RED),
	SHANGHAI(Color.RED),
	ST_PETERSBURG(Color.BLUE),
	SYDNEY(Color.RED),
	TAIPEI(Color.RED),
	TEHRAN(Color.BLACK),
	TOKYO(Color.RED),
	WASHINGTON(Color.BLUE);
	
	private final Color color;
	private City(Color color) 
	{
		this.color = color;
	}
	public Color color() {return color;}
}
