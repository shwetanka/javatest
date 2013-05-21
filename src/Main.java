import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String a[]){
    //Pattern p = Pattern.compile("\\s*\\{\\{ extends '(\\w[.-]*)+' \\}\\}.*");
    //Pattern p = Pattern.compile(".*\\{\\{ block (\\w[_-]*)+ \\}\\}.*");
    //Pattern p = Pattern.compile(".*\\{\\{ endblock (\\w[_-]*)+ \\}\\}.*");
    //Pattern p = Pattern.compile("\\{\\{ block (\\w[_-]*)+ \\}\\}");

    Pattern p = Pattern.compile("\\d\\d\\d");
    String str = "ab123";


    //String str = "    \t\n \n  {{ extends 'b-_ase-fg.jsp' }}hjhj" ;
    //String str = "{{ block b-_ase-fg }}";
    Matcher m = p.matcher(str);
    //Matcher m = p.matcher(" hjgf {{ block b-_ase-fg }} jdhfjk");
    //Matcher m = p.matcher("  ab  \t {{ endblock b-_ase-fg }}hjhj");

    System.out.println(m.matches());
    if(m.matches()){
      System.out.println(str.indexOf("{{"));
      //System.out.println(str.indexOf("'"));
      //System.out.println(str.substring(str.indexOf("'")+1, str.lastIndexOf("'")));
      
    }
    System.out.println(m.find(0));
    while (m.find()) {
			System.out.print("Start index: " + m.start());
			System.out.print(" End index: " + m.end() + " ");
			System.out.println(m.group());
		}
  }
}