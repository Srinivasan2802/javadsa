import java.util.*;
import java.util.Arrays;
import java.math.*;
public class hello
{
public static BigInteger countOddPaths(int i,int j,int ar[][],int m,int n,BigInteger [][]dp)
{
  if(i==m-1 && j==n-1)
   return BigInteger.ONE;
  if(i>=m && j>=n)
   return BigInteger.ZERO;
  if(ar[i][j]%2==0)
   return BigInteger.ZERO;
  if(dp[i][j].equals(BigInteger.ONE.negate())))
 {
   dp[i][j]=countOddPaths(i+1,j,ar,m,n,dp).add(countOddPaths(i,j+1,r,m,n,dp));
 }
  return dp[i][j];
}

public static void main(String[] args)
{
   int r,c;
   Scanner sc=new Scanner(System.in));
   r=sc.nextInt();c=sc.nextInt();
   int [][]ar=new int[r][c];
   for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;;j++)
 	{
	  ar[i][j]=sc.nextInt();
	}
   }
   BigInteger [][]dp=new BigInteger[r][c];
   BigInteger neg=new BigInteger.valueof(-1);
   for(int i=0;i<r;i++)
	Arrays.fill(dp[i],neg);
   BigInteger ways=new BigInteger();
   ways=countOddPaths(0,0,ar,r,c,dp);
   System.out.print(ways);
}
}
