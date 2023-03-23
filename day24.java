import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import com.sun.speech.freetts.*;
public class day24 implements ActionListener
{

  JButton b1;
  JTextArea ta;
  JFrame f=new JFrame("TEXT TO SPEECH CONVERSION");
  day24()
  {  
     ta=new JTextArea(20,20);
     ta.setBounds(10,10,380,200);
     JScrollPane s=new JScrollPane(ta);
     b1=new JButton("SUBMIT");
    f.getContentPane().add(s);
    f.add(b1);
     b1.addActionListener(this);
     f.setSize(400,400);
     f.setLayout(new FlowLayout());
     f.setVisible(true);
     f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
  } 
  public static void main(String args[])
  {
    new day24();
  } 
  @SuppressWarnings("unchecked")
  public void actionPerformed(ActionEvent e)
  {
    final String VOICENAME="kevin16";
      Voice voice;
      VoiceManager vm=VoiceManager.getInstance();
      voice =vm.getVoice(VOICENAME);
      voice.allocate();
      try
      {
           voice.speak(ta.getText());
      }
      catch(Exception e1)
      {
            e1.printStackTrace();
      }
  }
}
