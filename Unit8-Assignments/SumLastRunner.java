//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin
//Date - January 26, 2022

public class SumLastRunner
{
	public static void main( String args[] )
	{											
		int[] nums = {-99,1,2,3,4,5,6,7,8,9,10,5};
		int[] nums2 = {10,9,8,7,6,5,4,3,2,1,-99};
		int[] nums3 = {10,20,30,40,50,-11818,40,30,20,10};
		int[] nums4 = {32767};
		int[] nums5 = {255,255};
		int[] nums6 = {9,10,-88,100,-555,2};
		int[] nums7 = {10,10,10,11,456};
		int[] nums8 = {-111,1,2,3,9,11,20,1};
		int[] nums9 = {9,8,7,6,5,4,3,2,0,-2,6};
		int[] nums10 = {12,15,18,21,23,1000};
		int[] nums11 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		int[] nums12 = {9,10,-8,10000,-5000,-3000};
		
		
		
		System.out.print(RaySumLast.go(nums) + "\n");
		System.out.print(RaySumLast.go(nums2) + "\n");
		System.out.print(RaySumLast.go(nums3) + "\n");
		System.out.print(RaySumLast.go(nums4) + "\n");
		System.out.print(RaySumLast.go(nums5) + "\n");
		System.out.print(RaySumLast.go(nums6) + "\n");
		System.out.print(RaySumLast.go(nums7) + "\n");
		System.out.print(RaySumLast.go(nums8) + "\n");
		System.out.print(RaySumLast.go(nums9) + "\n");
		System.out.print(RaySumLast.go(nums10) + "\n");
		System.out.print(RaySumLast.go(nums11) + "\n");
		System.out.print(RaySumLast.go(nums12) + "\n");
	}
}