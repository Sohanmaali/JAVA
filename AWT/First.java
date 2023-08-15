import java.awt.*;    
  
// extending Frame class to our class AWTExample1  
class AWTExample1 extends Frame {    
  
  
   AWTExample1() {  
  
     
      Button b = new Button("Click Me!!");  
  
     
      b.setBounds(30,100,80,30);  
  
        
      add(b);  
  
     
      setSize(300,300);  
  
      
      setTitle("This is our basic AWT example");   
     
      setLayout(null);   
  
      // now frame will be visible, by default it is not visible    
      setVisible(true);  
}    
  
// main method  
public static void main(String args[]) {   
  
// creating instance of Frame class   
AWTExample1 f = new AWTExample1();    
  
}  
  
}    