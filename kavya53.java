/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=number;++i)
        if(number%i==0)
        System.out.println(i+" ");
         
	}
}
