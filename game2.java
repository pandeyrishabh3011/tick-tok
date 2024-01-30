
/**
 * Write a description of class game2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class game2
{ int mat [][]=new int [3][3]; 
    String mat1[][]={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    void assignvalue()
    {int l=1;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j]=l;
                l++;
            }
        }
    }
    
    
    
    
    void put(int b)
       {
       for(int i=0;i<3;i++)
       {
           for (int j =0;j<3;j++)
           {
               if(b==mat[i][j])
               {
                   mat1[i][j]="o";
                   
                 break;  

                }
               
               
               
           }
           
     
    }
}
void put2(int b)
       {
       for(int i=0;i<3;i++)
       {
           for (int j =0;j<3;j++)
           {
               if(b==mat[i][j])
               {
                   mat1[i][j]="x";
                   
                   break;

                }
               
               
               
           }
           
     
    }
}
void print()
{
    
       for(int i=0;i<3;i++)
       {
           for (int j =0;j<3;j++)
           {
               System.out.print(mat1[i][j]);
               
               
               
           }
           System.out.println();
       } 
    
}
void print2()
    {
       for(int i=0;i<3;i++)
       {
           for (int j =0;j<3;j++)
           {
               System.out.print(mat1[i][j]);
               
               
               
           }
           System.out.println();
       } 
        
    }

    
    boolean check()
    
    { int ch=0;int t=0;
        //for rows  checking
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if(mat1[i][j]=="o")
                {
                 t++ ;  
                }
            }
            if(t==3)
            {
              ch=2; 
              break;
            }
            else
            {
               ch=0; t=0;
            }
        }
        //checking rows
        int ch2=0;t=0;
        for (int j=0;j<3;j++)
        {
            for (int i=0;i<3;i++)
            {
                if(mat1[i][j]=="o")
                {
                 t++ ;  
                }
            }
            if(t==3)
            {
              ch2=1; 
              break;
            }
            else
            {
                ch2=0;t=0;
            }
        }
        //checking 1 diagonal
        if(ch==2)
        {
            return true;
            
        }
        else if(ch2==1)
        {
            return true;
        
        }
        else if(mat1[0][0]=="o"&&mat1[1][1]=="o"&&mat1[2][2]=="o")
            {
                return true;
            }
            
            
            
            
            //reverse diagonal check
            else if(mat1[0][2]=="o"&&mat1[1][1]=="o"&&mat1[2][0]=="o")
            {
                return true;
            }
            else
            {
                return false;
            }
            
        
    
   
}
boolean check4()
{int t=0;
    for(int i=0;i<3;i++)
    {
       
        for(int j=0;j<3;j++)
        {
            if(mat1[i][j]=="o"||mat1[i][j]=="x")
            {
                t++;
            }
        }
    }
    if(t==9)
    {
        return false;
    }
    else
    {
        return true;
    }
    
}
boolean check2()
    
    { int ch=0;int t=0;
        //for rows  checking
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if(mat1[i][j]=="x")
                {
                 t++ ;  
                }
            }
            if(t==3)
            {
              ch=2; 
              break;
            }
            else
            {
               ch=0; t=0;
            }
        }
        //checking rows
        int ch2=0;t=0;
        for (int j=0;j<3;j++)
        {
            for (int i=0;i<3;i++)
            {
                if(mat1[i][j]=="x")
                {
                 t++ ;  
                }
            }
            if(t==3)
            {
              ch2=1; 
              break;
            }
            else
            {
                ch2=0;t=0;
            }
        }
        //checking 1 diagonal
        if(ch==2)
        {
            return true;
            
        }
        else if(ch2==1)
        {
            return true;
        
        }
        else if(mat1[0][0]=="x"&&mat1[1][1]=="v"&&mat1[2][2]=="x")
            {
                return true;
            }
            
            
            
            
            //reverse diagonal check
            else if(mat1[0][2]=="x"&&mat1[1][1]=="x"&&mat1[2][0]=="x")
            {
                return true;
            }
            else
            {
                return false;
            }
            
        
    
   
}
boolean check3(int b)
{
    
    int m=0;
    for(int i=0;i<3;i++)
    {
        for (int j=0;j<3;j++)
        { if(mat[i][j]==b)
            {
                if(mat1[i][j]=="o"||mat1[i][j]=="x")
                { 
                     m=1;
                }
                
                
            }
            
            
        }
    }

if (m==1)
{
    return true;
}
else 
{
    return false;
}




}
    
    public static void main(String args[])
    {Scanner sc = new Scanner (System.in);
        game2 gm2 = new game2(); 
       gm2.assignvalue();
       System.out.println("tik and cross game ");
        System.out.println("click the number where you want to put your choise ");
         System.out.println("player A =o");
          System.out.println("player B=x ");
       gm2.print2();
       
       int ch;int i=0;
       while(gm2.check4())
       { 
           if(i%2==0)
           {
           System.out.println("Player A choise :");
        ch =sc.nextInt();
        
        if(gm2.check3(ch)==true)
        {
            System.out.println("it is already marked,MARK AGAIN");
            i++;
        }
       else
       {
        gm2.put(ch);
       gm2.print2();
    }
             }
       else 
       {
           System.out.println("Player B choise :");
        ch =sc.nextInt();
        if(gm2.check3(ch)==true)
        {
            System.out.println("it is already marked ,MARK AGAIN ");
            i++;
        }
       else
       {
        gm2.put2(ch);
       gm2.print2();
       
    } 
}
       
       
       if(i>=4)
       {
           if(gm2.check2()==true)
           {
            System.out.println("player B is winner");
            break;
            
            }
             if(gm2.check()==true)
           {
            System.out.println("player A is winner");
            break;
            
            }
       }
    
       i++;
       
       }
       System.out.println("game over");
       
       
        
    }
    
    
}
