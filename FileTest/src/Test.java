class id
{static int a=1;
String em;
String bcode;

id()
{String t="";
    if(a/10==0)
{char b=(char)(a+'0');
    t="000"+b;
}
else if(a/100==0)
{char b=(char)((a%10)+'0');
char c=(char)((a/10)+'0');
//System.out.println(b+" "+c);
t="00"+c+""+b;
}
em="f2017"+t+"@pilani.bits-pilani.ac.in";
System.out.println(em);
a++;
}
}
class st{
    static int i=0;
    static void meth()
    {i++;}
    static void meth(int x)
    {i=i+x;
    }
    void display()
    {System.out.println(i);
    }    
}
class cons{
    cons()
    {System.out.println("Default");
    }
    cons(int x)
    {this();
        System.out.println("One Arg:"+x);
    }
    cons(int x, int y)
    {this();
        System.out.println("Two Args:"+x+" & "+y);
        this.disp();
    }
    void disp()
    {System.out.println("In disp");
    }
}
final class imm{
final int x;
final int y;
imm()
{x=-1;y=-1;
}
imm(int x,int y)
{this.x=x;this.y=y;}
final void disp()
{System.out.println(this.x+" "+this.y);
}

}
class Test
{
    public static void main(String args[])
    {/*for(int i=0;i<99;i++)
    {id a=new id();
    }
    st s=new st();
    st.meth();s.display();
     st.meth();s.display(); st.meth(3);s.display(); st.meth();s.display(); st.meth(4);s.display(); st.meth();
    s.display();
    
    //cons c=new cons(2,3);
    String s=new String("Hello");
    System.out.println(s.concat(" World"));
    String s2=s.concat(" World");
    System.out.println(s+ "\n"+s2);*/
    imm i=new imm();
    imm j=new imm(3,4);
    i.disp();j.disp();
    }
}