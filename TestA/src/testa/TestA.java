/*
Programmer	: Thando Ngwenya
Date		: 27/07/2018
Program		: TestArray but it should have been named LoopArray
Description	: Displays array elements using a loop
*/
package testa;
public class TestA 
{
    public static void main(String[] args) 
    {
        int[] valueList = {1, 2, 3, 4};
   
        for (int sub=0;sub<valueList.length;++sub)
        {
            System.out.println("The array value is "+ sub);
        }
    }
}
