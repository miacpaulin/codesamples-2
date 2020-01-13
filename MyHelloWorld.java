import java.awt.image.*;
import java.applet.applet.*;
import javax.swing.textArea.*;
import javax.swing.textfield.;
import java.awt.image.bufferedImage.*;
import java.awt.event.*;
import java.awt.component.*;
import java.awt.font.*;
public class MyHelloWorld {
    
    public static void main(String []args){
    Applet myApplet=new Applet();
    myApplet.setBackground().setImage(image1.jpg).setText("Hello World. /n This is my work.").setFont(new Font(bold, helvetica,20));
    Panel northPanel=new Panel();
    myApplet.add(northPanel,BorderLayout.NORTH);
    Panel midPanel=new Panel();
    myApplet.add(midPanel,BorderLayout.CENTER); 
    Panel southPanel=new Panel();
    myApplet.add(southPanel, BorderLayout.South);
    Label greetingLabel= new Label("Enter your greeting.");
    Scanner console=new Scanner(System.in);
    String greetMe=console.next();
    TextArea youGreetMe=new TextArea(greetMe).setFont(new Font(italic, helvetica, 5));
    midPanel.add(greetingLabel);
    midPanel.add(youGreetMe);
    Panel eastPanel=new Panel();
    southPanel.add(eastPanel, Borderlayout.EAST);
    Panel centerPanel=new Panel();
    southPanel.add(centerPanel, BorderLayout.CENTER);
    Panel westPanel= new Panel();
    southPanel.add(westPanel,BorderLayout.WEST);
    Button button1=new Button("Greet").color.red;
    TextArea text1= new TextArea("Hi, my name is Mia Paulin /n and I'm really excited about /n this opportunity and that you /n are viewing this.");
    ActionListener greetListener= new ActionLister(){
     public void actionPerformed(ActionEvent event)       
        {
           eastPanel.getImage(image2.jpg).setText(text1).setFontStyle(Helvetica);
        }
        };
          button1.addActionListener(greetListener);
          eastPanel.add(button1);
          Button button2=new Button("Thanks");
           TextArea thanksArea=new TextArea("I'm thankful for this /n opportunity and all of your/n time, patience and consideration. /n I look forward to working with /n you.");
            ActionListener thanksListener= new ActionListener()
            {
             public void actionPerformed(ActionEvent event){ 
            centerPanel.setImage(image3.jpg).setText(thanksText).setFont(new font(bold, Helvetica, 5));
        }
   
    
        } ;
    
    button2.addActionListener(thanksListener);
    centerPanel.add(button2);
    
    TextArea contactText=new TextArea("My contact information /n is as followed:/n (803)862-6838 /n miacp39@gmail.com");
     Button button3=new Button("Contact me").color.yellow;
     ActionListener contactListener=new ActionListener(){
        public void actionPerformed(ActionEvent event)
        {
            westPanel.getImage(image4.jpg).setText("contactText").setFont(new Font(Italic, Helvetica, 5));
        
        }
        };
    
      button3.addActionListener(contactListner);
      westPanel.add(button3);
    
      Panel southPanel2=new Panel();
      westPanel.add(southPanel2,BorderLayout.SOUTH);
      Button exitButton=new botton("Exit").color.purple;
      ActionListener ExitListener=new ActionListener(){
        public void actionPerformed(ActionEvent event){
            system.exit(0);
        } 
    
        };
    }
}