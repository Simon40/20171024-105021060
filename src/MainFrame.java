import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {
    private int screenW= Toolkit.getDefaultToolkit().getScreenSize().width;
    private int screenH= Toolkit.getDefaultToolkit().getScreenSize().height;
    private int frmW=500,frmH=400;
    private JMenuBar jmb=new JMenuBar();
    private JMenu jmF=new JMenu("File");
    private JMenu jmR=new JMenu("Set");
    private JMenu jmA=new JMenu("Game");
    private JMenu jmM=new JMenu("About");
    private JMenuItem jMexit=new JMenuItem("Exit");
    private JMenuItem jMscreen=new JMenuItem("Loto");
    private JDesktopPane jdp=new JDesktopPane();
    private JInternalFrame jif=new JInternalFrame();
    private JPanel jp=new JPanel(new GridLayout(1,6,6,5));
    private LoginFrame loginfrm;
    MainFrame(){

        initComp();
    }
    private void initComp(){
        this.setBounds(screenW/2-frmW/2,screenH/2-frmH/2,frmW,frmH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setJMenuBar(jmb);
        this.setContentPane(jdp);
        this.add(jp,BorderLayout.CENTER);

        jmb.add(jmF);
        jmb.add(jmR);
        jmb.add(jmA);
        jmb.add(jmM);
        jmF.add(jMexit);
        jmA.add(jMscreen);
        jif.setBounds(0,0,200,80);
        jMexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });
        jMscreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jdp.add(jif);
                jif.setVisible(true);
            }
        });
        jMexit.setAccelerator(KeyStroke.getKeyStroke('X',Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));


    }
}
