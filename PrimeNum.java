
public class PrimeNum {

	public static void main(String[] args) {
		System.out.println(isPerfectPower(32));
	}
	
	static boolean isPerfectPower(int n) {
		
		if (n == 0)
			return false;
		if (n == 1)
            return true;

        if (n == 2)
            return true;

        int temp = n;
        for(int i=2; i*i <= n; i++)
        {
            temp = n;
            while(temp > 1)
            {
                if (temp % i != 0)
                    break;
                temp = temp / i;
            }

            if (temp == 1)
                return true;
        }

        return false;
	}

}
