
public class RSA {
    
	public int p, q, n, z, d = 0, e, i;
	
    public RSA()
    {
    	p = 3;
        q = 11;
        n = p * q;
        z = (p - 1) * (q - 1);
        
        for (e = 2; e < z; e++) 
        {
            if (gcd(e, z) == 1) 
            	break;
        }
        
        for (i = 0; i <= 9; i++) 
        {
            int x = 1 + (i * z);
            if (x % e == 0) 
            {
                d = x / e;
                break;
            }
        }
    }
    
    public double Encryption(int msg)
    {
    	double c = (Math.pow(msg, e)) % n;
        return c;
    }
    
    public double Decryption(int c)
    {
    	double msgback = (Math.pow(c, d)) % n;
        return msgback;
    }
    
    public int gcd(int e, int z)
    {
        if (e == 0)
            return z;
        else
            return gcd(z % e, e);
    }
    
}