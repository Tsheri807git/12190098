public class stacklinklisttest
{
	public static void main(String[] args) {
		stacklinklist obj = new stacklinklist();
		obj.push(1);
		obj.push(2);
		
		assert(obj.size()==1);
		assert(obj.isEmpty()==false);
		assert(obj.top()==2);
		assert(obj.pop()==2);
		System.out.println("All TextCases are Passed");
	}
}