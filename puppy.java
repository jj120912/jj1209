public class puppy{//如何访问实例变量调用成员方法
	int puppyage;
	public puppy(String name){//传参数name
		System.out.println("小狗的名字" + name);
	}
	public void setage(int age) {
		puppyage=age;
	}
	
	public int getage() {
		System.out.println("小狗年龄" + puppyage);
		return puppyage;
	}
	
	public static void main (String[] args) {
		puppy mypuppy = new puppy("tommy");
		mypuppy.setage(2);
		mypuppy.getage();
		System.out.println("变量值" + mypuppy.puppyage);
	}
}