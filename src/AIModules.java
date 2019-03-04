import java.util.ArrayList;
import java.util.List;

public class AIModules{
int numParts;
int data;
public AIModules(int numParts, String name, int data) {
this.numParts = numParts;
this.data = name.length()+data*name.length();
System.out.println("" + this.data);
}
List<AIInterface> modules = new ArrayList<>();
{
modules.add(new AIMover());
modules.add(new AIActions());
modules.add(new AIPersonal());
modules.add(new AICalculator());
 }
public String askQuestion(String question) {
String answer = "";
for(AIInterface i : modules) {
if(i.question(question) != null){
 answer = answer+i.question(question);
}
}
if(answer != "") {
return answer;
}else {
return "Sorry, I don't understand.";
}
}
}
