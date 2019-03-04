
public class AIPersonal implements AIInterface {

	@Override
	public String question(String q) {
if(q.startsWith("Who")) {
if(q.contains("you")) {
return "I am an unnamed AI, ask me another question.";
}else if(q.contains("I")) {
return "I don't know your name.";
}else {
return null;
}
}else {
return null;
}
	}

}
