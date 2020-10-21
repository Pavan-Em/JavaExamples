package Basic01;
				/* Find duplicte in the Array */
public class DSA01 {
	public static void main(String[] args) {
		
		/* sort the given Array  --->time taken 0(n logn) and extra space of 0(1)
		 * So Go for frequency    ----> time taken 0(n) and space 0(1)
		 * 
		 * Linked list cycle method
		 * ex---> [2,5,9,6,9,3,8,9,7,1]
		 * index-> 0 1 2 3 4 5 6 7 8 9
		 * 2-->9-->1-->5-->3-->6-->8-->7        2-->[2]9-->[9]1-->[1]5-->[5]3......
		 *     s   f   
		 *         s       f
		 *             s           f
		 *     f           s
		 *             f       s
		 *                      f  s
		 *                            f/s(colides)stop moviing 
		 *                            
		 * replace fast with first number
		 * then then move slow and fast with same speed
		 * when both will meet thats is the 1st duplicate number
		 * 
		 *      
		 * then we use tortoise method this method tells take two pointers 1.slow pointer 2.fast pointer
		 * 
		 * slow pointer  ---> move 1 step
		 * fast pointer  ---> move 2 step
		 */
		
		int[] num = {2,5,9,6,9,3,8,9,7,1};
		int slow=num[0];
		int fast=num[0];
		do {
			slow=num[slow];
			fast=num[num[fast]];
		}while(slow!=fast);
		
			fast=num[0];
			
		while(slow!=fast)
		{
			slow=num[slow];
			fast=num[fast];
		}
		System.out.println(slow);
	}
}
