/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanfields.beans;

import java.io.Serializable;

/**
 *
 * @author Mathekga M. Emmanuel
 */
public class PrimeBean implements Serializable {
    
    private static final long max = 9223372036854775783L;
    private long prime = 2;
    
    public PrimeBean()
    {
        
    }
    
    public long getPrime()
    {
        return prime;
    }
    
    public void setPrime(long n) throws Exception
    {
        if( !isPrime(n) ) throw new Exception("Illegal Prime");
        prime = n; 
    }
    
    public boolean next()
    {
        if(prime < max)
        {
            if(prime == 2) prime = 3;
            else for (prime +=2; !isPrime(prime); prime+=2);
                return true;
        }
        return false; 
    }
    
    public boolean prev()
    {
        if(prime < max)
        {
            if(prime == 3) prime = 2;
            else for (prime -=2; !isPrime(prime); prime-=2);
                return true;
        }
        return false; 
    }
    
    public static boolean isPrime(long n)
    {
        if(n == 2 || n == 3 || n == 5 || n == 7) return true; 
        if(n < 11 || n % 2 == 0  ) return false; 
        for( long t = 3, m = (long)Math.sqrt(n) + 1; t <= m; t +=2  )
            if(n % t == 0) return false;
        return true; 
    }
}
