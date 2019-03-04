
public class AIMover implements AIInterface {

	@Override
	public String question(String q) {
if(q.startsWith("Where")) {
if(q.contains("box")) {
return "The box is in the real world on the desk.";
}else if(q.contains("table")){
return "The table is where you can smell PIZZA!";
}else {
return null;
}
}else {
return null;
}
	}

}
