
import java.util.ArrayList;
import java.util.List;
public class AICalculator implements AIInterface {

	@Override
	public String question(String q) {
char[] letters = q.toCharArray();
List<Integer> numbers = new ArrayList<>();
int mathsType = 0;
for(int i = 0; i < letters.length; i++) {
if(Character.isDigit(letters[i])) {
numbers.add(Integer.parseInt("" + letters[i]));
}else if(letters[i] == '+') {
mathsType = 1;
}
	}
int answer = 0;
if(mathsType == 1) {
answer = numbers.get(0) + numbers.get(1);
}
if(answer == 0) {
		return null;
}else {
return "The answer is " + answer;
}
	}

}
