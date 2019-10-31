package classroomprctc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressions {
//	s
//	S
//	d
//	D
//	w
//	W

public static void main(String[] args) {
	Pattern p =Pattern.compile("\\W");
	Matcher m = p.matcher("maveric5645");
	while(m.find()) {
	System.out.println(m.start()+"...."+m.end()+"...."+m.group());
}
}

}
