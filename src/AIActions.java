
public class AIActions implements AIInterface {

	@Override
	public String question(String q) {
if(q.startsWith("Show") && q.contains("yourself")) {
return "I need privacy, i am getting changed!";
}else if(q.startsWith("Go") && q.contains("away")) {
return "You can just close the window if you don't want to stay.";
}else {
return null;
}
	}

}
