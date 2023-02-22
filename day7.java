import java.awt.*;
import java.awt.event.*;
class day7 extends Frame implements ActionListener
{   
    int d=0,f=0,plus=0,mul=0,div=0,sub=0,g=0,a=0,b=0;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    Label l1;
    TextField t1;
    TextField t2;
    TextField t3;
  day7()
  {
    b1=new Button("+");
    b2=new Button("-");
    b3=new Button("*");
    b4=new Button("/");
   // b5=new Button("%");
    b6=new Button("=");
    b7=new Button("AC");
    b8=new Button("1");
    b9=new Button("2");
    b10=new Button("3");
    b11=new Button("4");
    b12=new Button("5");
    b13=new Button("6");
    b14=new Button("7");
    b15=new Button("8");
    b16=new Button("9");
    b17=new Button("0");
    b18=new Button();
    t1=new TextField("0");
    t2=new TextField();
    t3=new TextField("0");
   t1.setBounds(500,150,200,25);
    t2.setBounds(50,150,200,50);
    t3.setBounds(500,150,200,25);
   //add(t1);
   //add(t3);
    add(t2);
    b1.setBounds(100,200,50,50);
    add(b1);
    b2.setBounds(150,200,50,50);
    add(b2);
    b3.setBounds(200,200,50,50);
    add(b3);
    b7.setBounds(50,200,50,50);
    add(b7);
    b8.setBounds(50,250,50,50);
    add(b8);
    b9.setBounds(100,250,50,50);
    add(b9);
    b10.setBounds(150,250,50,50);
    add(b10);
    b4.setBounds(200,250,50,50);
    add(b4);
    b11.setBounds(50,300,50,50);
    add(b11);
    b12.setBounds(100,300,50,50);
    add(b12);
    b13.setBounds(150,300,50,50);
    add(b13);
    b14.setBounds(50,350,50,50);
    add(b14);
    b15.setBounds(100,350,50,50);
    add(b15);
    b16.setBounds(150,350,50,50);
    add(b16);
    b6.setBounds(200,300,50,50);
    add(b6);

    b17.setBounds(200,350,50,50);
    add(b17);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
    b14.addActionListener(this);
    b15.addActionListener(this);
    b16.addActionListener(this);
    b17.addActionListener(this);
    b18.setBounds(100,100,50,50);
    add(b18);
    addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e)
        {
            System.exit(0); 
        }
    });
    setSize(500,500);
    setVisible(true);
    setLayout(null);
  }
  public void actionPerformed(ActionEvent e)
  {  
     if(e.getSource()==b1)
     {  
        plus=1;
        a=Integer.parseInt(t2.getText());
        t2.setText("00");
     
     }
     if(e.getSource()==b2)
     {
     // t2.setText(t2.getText()+"-");
      sub=1;
      a=Integer.parseInt(t2.getText());
      t2.setText("00");
     }
     if(e.getSource()==b3)
     {

     // t2.setText(t2.getText()+"-");
      mul=1;
      a=Integer.parseInt(t2.getText());
      t2.setText("00");
     }
     if(e.getSource()==b4)
     {
       // t2.setText(t2.getText()+"-");
      div=1;
      a=Integer.parseInt(t2.getText());
      t2.setText("00");
     }
     if(e.getSource()==b6)
     {   System.out.println("HELLO");
        if(plus==1)
        {
            b=Integer.parseInt(t2.getText());
            t2.setText(String.valueOf(a+b));
            //System.out.print(a);
            //System.out.print(b);
            plus=0;
        }
        if(sub==1)
        {
            b=Integer.parseInt(t2.getText());
            t2.setText(String.valueOf(a-b));
            //System.out.print(a);
            //System.out.print(b);
            sub=0;
        }
        if(mul==1)
        {
            b=Integer.parseInt(t2.getText());
            t2.setText(String.valueOf(a*b));
            //System.out.print(a);
            //System.out.print(b);
            mul=0;
        }
        if(div==1)
        {
            b=Integer.parseInt(t2.getText());
            t2.setText(String.valueOf(a*b));
            //System.out.print(a);
            //System.out.print(b);
            div=0;
        }
    
     }
     if(e.getSource()==b7)
     {
        //t1.setText("");
        t2.setText("");
     }
     if(e.getSource()==b8)
     {
        //t2.setText("1");
        t2.setText(t2.getText()+"1");
     //   t3.setText(t3.getText()+"1");
     }
     if(e.getSource()==b9)
     {
        t2.setText(t2.getText()+"2");
      //  t3.setText(t3.getText()+"2");
     }
     if(e.getSource()==b10)
     {
        t2.setText(t2.getText()+"3");
       // t3.setText(t3.getText()+"3");
     }
     if(e.getSource()==b11)
     {
        t2.setText(t2.getText()+"4");
       // t3.setText(t3.getText()+"4");
     }
     if(e.getSource()==b12)
     {
        t2.setText(t2.getText()+"5");
        t3.setText(t3.getText()+"5");
     }
     if(e.getSource()==b13)
     {
        t2.setText(t2.getText()+"6");
       // t3.setText(t3.getText()+"6");
     }
     if(e.getSource()==b14)
     {
        t2.setText(t2.getText()+"7");
       // t3.setText(t3.getText()+"7");
     }
     if(e.getSource()==b15)
     {
        t2.setText(t2.getText()+"8");
     }
     if(e.getSource()==b16)
     {
        t2.setText(t2.getText()+"9");
       // t3.setText(t3.getText()+"9");
     }
     if(e.getSource()==b17)
     {
        t2.setText(t2.getText()+"0");
       // t3.setText(t3.getText()+"0");
     }
  }
  public static void main(String args[])
  {
    new day7();
  }
}