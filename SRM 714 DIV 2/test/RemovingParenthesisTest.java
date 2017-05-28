import org.junit.Test;
import static org.junit.Assert.*;

public class RemovingParenthesisTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "()()()()()";
		assertEquals(1, new RemovingParenthesis().countWays(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "(((())))" ;
		assertEquals(24, new RemovingParenthesis().countWays(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "((()()()))" ;
		assertEquals(54, new RemovingParenthesis().countWays(s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "(())(())(())" ;
		assertEquals(8, new RemovingParenthesis().countWays(s));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "((()))(()(()))((()))";
		assertEquals(432, new RemovingParenthesis().countWays(s));
	}
}
