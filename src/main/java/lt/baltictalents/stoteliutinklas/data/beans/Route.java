package lt.baltictalents.stoteliutinklas.data.beans;

public class Route {
	private String routeName;
	private String startStationName;
	private String finalStationName;
	
	public Route(String routeName, String startStationName, String finalStationName) {
		this.routeName = routeName;
		this.startStationName = startStationName;
		this.finalStationName = finalStationName;
	}
	
	public String getStartStationName() {
		return startStationName;
	}
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getFinalStationName() {
		return finalStationName;
	}
	public void setFinalStationName(String finalStationName) {
		this.finalStationName = finalStationName;
	}
	public String toString() {
		return getRouteName() + " " + getStartStationName() + " " +  getFinalStationName() ;
	}
	
}
