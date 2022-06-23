class Solution
{
    public int gcd(int N , int arr[]) 
    { 
       //code here.
        if(N==1)
            return arr[0];
        int x=arr[0];
        for(int i=1;i<N;i++)
            x=get(x,arr[i]);
        return x;
    } 
    int get(int a,int b)
	{
	    if(b==0)
	        return a;
	    return get(b,a%b);
	}
}