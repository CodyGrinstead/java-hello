/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static kiss.API.*;


public class HelloWorld {
    void testRun(){
        try(Close out=outExpect("Hello!")){run();}
    }
    
    void run(){
        println("Hello!");
    }
    void testBooleans(){
      assert true != false;
      assert true ==  true;
      assert false ==false;
      try (Close out=outExpect("true")){println(true);}
      try (Close out=outExpect("false")){println(false);}
      
      // not
      assert !true ==false;
      assert !false ==true;
      
      //and
      
      assert (true && true)== true;
      assert (true && false)==false;
      assert (false && true )== false;
      assert (false && false) ==false;
      assert(false && (3/0==3))==false;
     
      //or
      
      assert (true || true)==true;
      assert (true||false)==true;
      assert (false||true)==true;
      assert (false ||false)==false;
      
      
      
    }
    void testints(){
        assert Integer.MAX_VALUE==Math.pow(2,31)-1;
        assert Integer.MIN_VALUE== -Math.pow(2,31);
        assert Integer.MIN_VALUE-1== Integer.MAX_VALUE;
        assert Integer.MAX_VALUE+1==Integer.MIN_VALUE;
        
        int x=3;
        int y= 0xff_ff;
        int z= 0b10_01;
        int a=1_000_000;
        
        
        assert x== 3;
        assert y==65_535;        
        assert a==1000000;       
        assert z==9;
        
        assert Integer.toString(x,10).equals("3");//.equal compares objects
        assert Integer.toString(y,16).equals("ffff");//toString makes lowercase hex
        assert Integer.toString(z,2).equals("1001");
        
        assert 17/5 ==3;
        assert 17%5==2;
        assert((double)17)/((double)5)==3.4;  
    }
}
