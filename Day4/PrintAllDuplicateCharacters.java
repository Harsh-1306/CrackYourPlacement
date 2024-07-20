import java.util.*;

static void printDups(String str)
{
  HashMap<Character, Integer> count = new HashMap<>();
  for(int i=0;i<str.length();i++)
  {
    if(count.containsKey(str.charAt(i)))
    {
        count.put(str.charAt(i),count.get(str.charAt(i))+1);
    }
    else
    {
        count.put(str.charAt(i),1);
    }
  }

for(Map.Entry<Character,Integer>mpp:count.entrySet())  //iterating through the unordered map 
    if (mpp.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
      System.out.println(mpp.getKey() + ", count = " + mpp.getValue());
  }
public static void main(String args[])
{
  String str = "abcccdddeeeefffhhjksh";
  printDups(str);
}
