import javax.swing.*;
import java.awt.event.*;
public class day15 implements ActionListener
{
    JFrame f=new JFrame("SCIENTIFIC CALUCLATOR");
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,pl,minus,mu,di,equal,clear,sin,cos,tan,cot,sec,cosec,sqrt,sq,cub,ac,lf,rf;
    JTextField tf=new JTextField("",5);
    JTextField ts=new JTextField("",5);
    int d=0,f1=0,plus=0,mul=0,div=0,sub=0,g=0,a=0,b=0;
    String val;
    double num1;
    int check=0;
    day15()
    {
      tf.setEditable(false);
      ts.setEditable(false);
      tf.setBounds(10,50,205,50);
      f.add(tf);
      ts.setBounds(215,50,185,50);
      f.add(ts);
      lf=new JButton("(");
      lf.setBounds(270,100,70,50);
      f.add(lf);
      lf.addActionListener(this);
      rf=new JButton(")");
      rf.setBounds(340,100,60,50);
      f.add(rf);
      rf.addActionListener(this);
      b1=new JButton("1");
      b1.setBounds(10,100,50,50);
      f.add(b1);
      b1.addActionListener(this);
      b2=new JButton("2");
      b2.setBounds(60,100,50,50);
      f.add(b2);
      b2.addActionListener(this);
      b3=new JButton("3");
      b3.setBounds(110,100,50,50);
      f.add(b3);
      b3.addActionListener(this);
      b4=new JButton("4");
      b4.setBounds(10,150,50,50);
      f.add(b4);
      b4.addActionListener(this);
      b5=new JButton("5");
      b5.setBounds(60,150,50,50);
      f.add(b5);
      b5.addActionListener(this);
      b6=new JButton("6");
      b6.setBounds(110,150,50,50);
      f.add(b6);
      b6.addActionListener(this);
      b7=new JButton("7");
      b7.setBounds(10,200,50,50);
      f.add(b7);
      b7.addActionListener(this);
      b8=new JButton("8");
      b8.setBounds(60,200,50,50);
      f.add(b8);
      b8.addActionListener(this);
      b9=new JButton("9");
      b9.setBounds(110,200,50,50);
      f.add(b9);
      b9.addActionListener(this);
      b0=new JButton("0");
      b0.setBounds(60,250,50,50);
      f.add(b0);
      b0.addActionListener(this);
      pl=new JButton("+");
      pl.setBounds(10,250,50,50);
      f.add(pl);
      pl.addActionListener(this);
      minus=new JButton("-");
      minus.setBounds(110,250,50,50);
      f.add(minus);
      minus.addActionListener(this);
      mu=new JButton("×");
      mu.setBounds(160,200,50,50);
      f.add(mu);
      mu.addActionListener(this);
      di=new JButton("/");
      di.setBounds(160,150,50,50);
      f.add(di);
      di.addActionListener(this);
      equal=new JButton("=");
      equal.setBounds(160,250,50,50);
      f.add(equal);
      equal.addActionListener(this);
      clear=new JButton("CLR");
      clear.setBounds(160,100,110,50);
      f.add(clear);
      clear.addActionListener(this);
      sin=new JButton("SIN");
      sin.setBounds(210,150,60,50);
      f.add(sin);
      sin.addActionListener(this);
      cos=new JButton("COS");
      cos.setBounds(210,200,60,50);
      f.add(cos);
      cos.addActionListener(this);
      tan=new JButton("TAN");
      tan.setBounds(210,250,60,50);
      f.add(tan);
      tan.addActionListener(this);
      cot=new JButton("COT");
      cot.setBounds(270,150,70,50);
      f.add(cot);
      cot.addActionListener(this);
      sec=new JButton("SEC");
      sec.setBounds(270,200,70,50);
      f.add(sec);
      sec.addActionListener(this);
      cosec=new JButton("Cosec");
      cosec.setBounds(270,250,70,50);
      f.add(cosec);
      cosec.addActionListener(this);
      sq=new JButton("SQ");
      sq.setBounds(340,250,60,50);
      f.add(sq);
      sq.addActionListener(this);
      sqrt=new JButton("SQT");
      sqrt.setBounds(340,200,60,50);
      f.add(sqrt);
      sqrt.addActionListener(this);
      cub=new JButton("CUB");
      cub.setBounds(340,150,60,50);
      f.add(cub);
      cub.addActionListener(this);
      ac=new JButton("AC");
      ac.setBounds(270,100,130,50);
     // f.add(ac);
      ac.addActionListener(this);
      //f.setLayout(new FlowLayout());
      f.setLayout(null);
      f.setSize(400,400);
      f.setVisible(true);
      f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new day15();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==clear)
      {
        tf.setText("");
        ts.setText("");
        check=0;
      }
      if(e.getSource()==b1)
      { val=tf.getText();
        val=val+"1";
        tf.setText(val);
        ts.setText(ts.getText()+"1");
      }
      else if(e.getSource()==b2)
      { val=tf.getText();
        val=val+"2";
        tf.setText(val);
        ts.setText(ts.getText()+"2");
      }
      else if(e.getSource()==b3)
      { val=tf.getText();
        val=val+"3";
        tf.setText(val);
        ts.setText(ts.getText()+"3");
      }
      else if(e.getSource()==b4)
      { val=tf.getText();
        val=val+"4";
        tf.setText(val);
        ts.setText(ts.getText()+"4");
      }
      else if(e.getSource()==b5)
      { val=tf.getText();
        val=val+"5";
        tf.setText(val);
        ts.setText(ts.getText()+"5");
      }
      else if(e.getSource()==b6)
      { val=tf.getText();
        val=val+"6";
        tf.setText(val);
        ts.setText(ts.getText()+"6");
      }
      else if(e.getSource()==b7)
      { val=tf.getText();
        val=val+"7";
        tf.setText(val);
        ts.setText(ts.getText()+"7");
      }
      else if(e.getSource()==b8)
      { val=tf.getText();
        val=val+"8";
        tf.setText(val);
        ts.setText(ts.getText()+"8");
      }
      else if(e.getSource()==b9)
      { val=tf.getText();
        val=val+"9";
        tf.setText(val);
        ts.setText(ts.getText()+"9");
      }
      else if(e.getSource()==b0)
      { val=tf.getText();
        val=val+"0";
        tf.setText(val);
        ts.setText(ts.getText()+"0");
      }
      else if(e.getSource()==pl)
      { val=tf.getText();
        num1=Double.parseDouble(ts.getText());
        val=val+"+";
        ts.setText("");
        tf.setText(val);
        check=1;
      }
      else if(e.getSource()==minus)
      { val=tf.getText();
        num1=Double.parseDouble(ts.getText());
        check=2;
        val=val+"-";
        ts.setText("");
        tf.setText(val);
      }
      else if(e.getSource()==di)
      { val=tf.getText();
        num1=Double.parseDouble(ts.getText());
        val=val+"/";
        ts.setText("");
        check=3;
        tf.setText(val);
      }
      else if(e.getSource()==mu)
      {
        val=tf.getText();
        num1=Double.parseDouble(ts.getText());
        val=val+"*";
        ts.setText("");
        check=4;
        tf.setText(val); 
      }
      else if(e.getSource()==sin)
      { val=tf.getText();
        val=val+"sin";
        check=5;
        tf.setText(val);
        ts.setText("");
      }
      else if(e.getSource()==cos)
      { val=tf.getText();
        val=val+"cos";
        check=6;
        tf.setText(val);
      }
      else if(e.getSource()==tan)
      { val=tf.getText();
        val=val+"tan";
        check=7;
        tf.setText(val);
      }
      else if(e.getSource()==cot)
      { val=tf.getText();
        val=val+"cot";
        check=8;
        tf.setText(val);
      }
      else if(e.getSource()==sec)
      { val=tf.getText();
        val=val+"sec";
        check=9;
        tf.setText(val);
      }
      else if(e.getSource()==cosec)
      { val=tf.getText();
        val=val+"cosec";
        check=10;
        tf.setText(val);
      }
      else if(e.getSource()==cub)
      { val=tf.getText();
        val=val+"cub";
        check=11;
        tf.setText(val);
      }
      else if(e.getSource()==sq)
      { val=tf.getText();
        val=val+"sq";
        check=12;
        tf.setText(val);
      }
      else if(e.getSource()==sqrt)
      { val=tf.getText();
        val=val+"sqrt";
        check=13;
        tf.setText(val);
      }
      else if(e.getSource()==lf)
      { val=tf.getText();
        val=val+"(";
        tf.setText(val);
      }
      else if(e.getSource()==rf)
      { val=tf.getText();
        val=val+")";
        tf.setText(val);
      }
      if(check<5)
      {
      if(check==1)
      {
        num1=num1+Double.parseDouble(ts.getText());
        ts.setText(String.valueOf(num1));
        check=0;
      }
      if(check==2)
      {
        num1=num1-Double.parseDouble(ts.getText());
        ts.setText(String.valueOf(num1));
        check=0;
      }
      if(check==3)
      {
        num1=num1/Double.parseDouble(ts.getText());
        ts.setText(String.valueOf(num1));
        check=0;
      }
      if(check==4)
      {
        num1=num1*Double.parseDouble(ts.getText());
        ts.setText(String.valueOf(num1));
        check=0;
      }
    }
    else if(check>=5)
    {  if(e.getSource()==equal)
      {
      if(check==5)
      {
        num1=Double.parseDouble(ts.getText());
        Double a=Math.toRadians(num1);
        ts.setText(String.valueOf(Math.sin(a)));
        check=0;
      }
     else if(check==6)
      {
        num1=Double.parseDouble(ts.getText());
        Double a=Math.toRadians(num1);
        ts.setText(String.valueOf(Math.cos(a)));
        check=0;
      }
     else if(check==7)
      {
        num1=Double.parseDouble(ts.getText());
        Double a=Math.toRadians(num1);
        ts.setText(String.valueOf(Math.tan(a)));
        check=0;
      }
     else if(check==8)
      {
        num1=Double.parseDouble(ts.getText());
        Double a=Math.toRadians(num1);
        ts.setText(String.valueOf(1/Math.tan(a)));
        check=0;
      }
     else if(check==9)
      {
        num1=Double.parseDouble(ts.getText());
        Double a=Math.toRadians(num1);
        ts.setText(String.valueOf(1/Math.cos(a)));
        check=0;
      }
     else if(check==10)
      {
        num1=Double.parseDouble(ts.getText());
        Double a=Math.toRadians(num1);
        ts.setText(String.valueOf(1/Math.sin(a)));
        check=0;
      }
    else if(check==11)
    {
      num1=Double.parseDouble(ts.getText());
      num1=num1*num1*num1;
      ts.setText(String.valueOf(num1));
      check=0;
    }
    else if(check==12)
    {
      num1=Double.parseDouble(ts.getText());
      num1=num1*num1;
      ts.setText(String.valueOf(num1));
      check=0;
    }
    else if(check==13)
    {
      num1=Double.parseDouble(ts.getText());
      num1=Math.sqrt(num1);
      ts.setText(String.valueOf(num1));
      check=0;
    }
    }
  }
      } 
}
