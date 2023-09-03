//循环执行次数是在执行前就确定了，语法格式：
//for（初始化;布尔表达式；
public class testfor {
	public static void main(String[] args) {
		
		for(int x = 10;x < 20;x=x+1) {
			System.out.println("x的值是" + x);
			System.out.println("\n");
		}
	}
}