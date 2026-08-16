
package arthive;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ContemporaryArt extends javax.swing.JFrame {

    /**
     * Creates new form ContemporaryArt
     */
    public ContemporaryArt() {
        initComponents();
        pnlArtTypeMenu.setVisible(false);
        
        pnlVisualArt1.setVisible(false);
        pnlVisualArt2.setVisible(false);
        pnlVisualArt3.setVisible(false);
        pnlVisualArt4.setVisible(false);
        pnlVisualArt5.setVisible(false);
        pnlVisualArt6.setVisible(false);
        pnlVisualArt7.setVisible(false);
        pnlVisualArt8.setVisible(false);
        
        lblArtproductId1.setVisible(false);
        lblArtproductId2.setVisible(false);
        lblArtproductId3.setVisible(false);
        lblArtproductId4.setVisible(false);
        lblArtproductId5.setVisible(false);
        lblArtproductId6.setVisible(false);
        lblArtproductId7.setVisible(false);
        lblArtproductId8.setVisible(false);
        
        lblMessage.setVisible(false);
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arthive","root","");
            
            Statement st = con.createStatement();
            
            
                ResultSet rs = st.executeQuery("select * from tblartproducts where ArtType='Contemporary Art'");
                
                int recordCount = 0;
                while(rs.next()){
                    recordCount++;
                 
                 switch(recordCount) {
                    case 1:
                        pnlVisualArt1.setVisible(true);
                        lblTitle1.setText(rs.getString("Title"));
                        lblImage1.setIcon(new ImageIcon(rs.getString("ImagePath")));
                        lblArtproductId1.setText(rs.getString("ID"));
                      break;
                    case 2:
                        pnlVisualArt2.setVisible(true);
                        lblTitle2.setText(rs.getString("Title"));
                        lblImage2.setIcon(new ImageIcon(rs.getString("ImagePath")));
                        lblArtproductId2.setText(rs.getString("ID"));
                      break;
                    case 3:
                        pnlVisualArt3.setVisible(true);
                        lblTitle3.setText(rs.getString("Title"));
                        lblTitle3.setIcon(new ImageIcon(rs.getString("ImagePath")));
                        lblArtproductId3.setText(rs.getString("ID"));
                      break;
                    case 4:
                        pnlVisualArt4.setVisible(true);
                        lblTitle4.setText(rs.getString("Title"));
                        lblImage4.setIcon(new ImageIcon(rs.getString("ImagePath")));
                        lblArtproductId4.setText(rs.getString("ID"));
                      break;
                    case 5:
                        pnlVisualArt5.setVisible(true);
                        lblTitle5.setText(rs.getString("Title"));
                        lblImage5.setIcon(new ImageIcon(rs.getString("ImagePath")));
                        lblArtproductId5.setText(rs.getString("ID"));
                      break;
                    case 6:
                        pnlVisualArt6.setVisible(true);
                        lblTitle6.setText(rs.getString("Title"));
                        lblImage6.setIcon(new ImageIcon(rs.getString("ImagePath")));
                        lblArtproductId6.setText(rs.getString("ID"));
                      break;
                    case 7:
                        pnlVisualArt7.setVisible(true);
                        lblTitle7.setText(rs.getString("Title"));
                        lblImage7.setIcon(new ImageIcon(rs.getString("ImagePath")));
                        lblArtproductId7.setText(rs.getString("ID"));
                      break;
                    case 8:
                        pnlVisualArt8.setVisible(true);
                        lblTitle8.setText(rs.getString("Title"));
                        lblImage8.setIcon(new ImageIcon(rs.getString("ImagePath")));
                        lblArtproductId8.setText(rs.getString("ID"));
                      break;
                    default:
                      // code block
                  }
                }
                if(recordCount == 0){
                    lblMessage.setVisible(true);
                    lblMessage.setText("No record to display.");
                }

            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, e, "Message", JOptionPane.ERROR_MESSAGE);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlVisualArtMain = new javax.swing.JPanel();
        pnlVisualArt1 = new javax.swing.JPanel();
        lblImage1 = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        lblArtproductId1 = new javax.swing.JLabel();
        pnlVisualArt2 = new javax.swing.JPanel();
        lblImage2 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblArtproductId2 = new javax.swing.JLabel();
        pnlVisualArt3 = new javax.swing.JPanel();
        lblImage3 = new javax.swing.JLabel();
        lblTitle3 = new javax.swing.JLabel();
        lblArtproductId3 = new javax.swing.JLabel();
        pnlVisualArt4 = new javax.swing.JPanel();
        lblImage4 = new javax.swing.JLabel();
        lblTitle4 = new javax.swing.JLabel();
        lblArtproductId4 = new javax.swing.JLabel();
        pnlVisualArt5 = new javax.swing.JPanel();
        lblImage5 = new javax.swing.JLabel();
        lblTitle5 = new javax.swing.JLabel();
        lblArtproductId5 = new javax.swing.JLabel();
        pnlVisualArt6 = new javax.swing.JPanel();
        lblImage6 = new javax.swing.JLabel();
        lblTitle6 = new javax.swing.JLabel();
        lblArtproductId6 = new javax.swing.JLabel();
        pnlVisualArt7 = new javax.swing.JPanel();
        lblImage7 = new javax.swing.JLabel();
        lblTitle7 = new javax.swing.JLabel();
        lblArtproductId7 = new javax.swing.JLabel();
        pnlVisualArt8 = new javax.swing.JPanel();
        lblImage8 = new javax.swing.JLabel();
        lblTitle8 = new javax.swing.JLabel();
        lblArtproductId8 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblAbout = new javax.swing.JLabel();
        pnlArtTypeMenu = new javax.swing.JPanel();
        lblVisualArt = new javax.swing.JLabel();
        lblSculpture = new javax.swing.JLabel();
        lblContemporaryArt = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblArtType = new javax.swing.JLabel();
        lblEvent = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel1.setText("Contemporary Art");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1280, 320));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1280, 320));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1280, 320));

        pnlVisualArtMain.setBackground(new java.awt.Color(255, 255, 255));

        pnlVisualArt1.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualArt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlVisualArt1.setAlignmentX(0.2F);
        pnlVisualArt1.setAlignmentY(0.2F);

        lblImage1.setAlignmentX(0.2F);
        lblImage1.setAlignmentY(0.2F);
        lblImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImage1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisualArt1Layout = new javax.swing.GroupLayout(pnlVisualArt1);
        pnlVisualArt1.setLayout(pnlVisualArt1Layout);
        pnlVisualArt1Layout.setHorizontalGroup(
            pnlVisualArt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualArt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage1)
                    .addComponent(lblTitle1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVisualArt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblArtproductId1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlVisualArt1Layout.setVerticalGroup(
            pnlVisualArt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblTitle1)
                .addGap(24, 24, 24))
            .addGroup(pnlVisualArt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(lblArtproductId1)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        pnlVisualArt2.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualArt2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlVisualArt2.setAlignmentX(0.2F);
        pnlVisualArt2.setAlignmentY(0.2F);

        lblImage2.setAlignmentX(0.2F);
        lblImage2.setAlignmentY(0.2F);
        lblImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImage2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisualArt2Layout = new javax.swing.GroupLayout(pnlVisualArt2);
        pnlVisualArt2.setLayout(pnlVisualArt2Layout);
        pnlVisualArt2Layout.setHorizontalGroup(
            pnlVisualArt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualArt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage2)
                    .addComponent(lblTitle2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVisualArt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblArtproductId2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlVisualArt2Layout.setVerticalGroup(
            pnlVisualArt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblTitle2)
                .addGap(24, 24, 24))
            .addGroup(pnlVisualArt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt2Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(lblArtproductId2)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        pnlVisualArt3.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualArt3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlVisualArt3.setAlignmentX(0.2F);
        pnlVisualArt3.setAlignmentY(0.2F);

        lblImage3.setAlignmentX(0.2F);
        lblImage3.setAlignmentY(0.2F);
        lblImage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImage3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisualArt3Layout = new javax.swing.GroupLayout(pnlVisualArt3);
        pnlVisualArt3.setLayout(pnlVisualArt3Layout);
        pnlVisualArt3Layout.setHorizontalGroup(
            pnlVisualArt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualArt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage3)
                    .addComponent(lblTitle3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVisualArt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblArtproductId3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlVisualArt3Layout.setVerticalGroup(
            pnlVisualArt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblTitle3)
                .addGap(24, 24, 24))
            .addGroup(pnlVisualArt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt3Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(lblArtproductId3)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        pnlVisualArt4.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualArt4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlVisualArt4.setAlignmentX(0.2F);
        pnlVisualArt4.setAlignmentY(0.2F);

        lblImage4.setAlignmentX(0.2F);
        lblImage4.setAlignmentY(0.2F);
        lblImage4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImage4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisualArt4Layout = new javax.swing.GroupLayout(pnlVisualArt4);
        pnlVisualArt4.setLayout(pnlVisualArt4Layout);
        pnlVisualArt4Layout.setHorizontalGroup(
            pnlVisualArt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualArt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage4)
                    .addComponent(lblTitle4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVisualArt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblArtproductId4)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlVisualArt4Layout.setVerticalGroup(
            pnlVisualArt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblTitle4)
                .addGap(24, 24, 24))
            .addGroup(pnlVisualArt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt4Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(lblArtproductId4)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        pnlVisualArt5.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualArt5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlVisualArt5.setAlignmentX(0.2F);
        pnlVisualArt5.setAlignmentY(0.2F);

        lblImage5.setAlignmentX(0.2F);
        lblImage5.setAlignmentY(0.2F);
        lblImage5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImage5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisualArt5Layout = new javax.swing.GroupLayout(pnlVisualArt5);
        pnlVisualArt5.setLayout(pnlVisualArt5Layout);
        pnlVisualArt5Layout.setHorizontalGroup(
            pnlVisualArt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualArt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage5)
                    .addComponent(lblTitle5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVisualArt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblArtproductId5)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlVisualArt5Layout.setVerticalGroup(
            pnlVisualArt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblTitle5)
                .addGap(24, 24, 24))
            .addGroup(pnlVisualArt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt5Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(lblArtproductId5)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        pnlVisualArt6.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualArt6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlVisualArt6.setAlignmentX(0.2F);
        pnlVisualArt6.setAlignmentY(0.2F);

        lblImage6.setAlignmentX(0.2F);
        lblImage6.setAlignmentY(0.2F);
        lblImage6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImage6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisualArt6Layout = new javax.swing.GroupLayout(pnlVisualArt6);
        pnlVisualArt6.setLayout(pnlVisualArt6Layout);
        pnlVisualArt6Layout.setHorizontalGroup(
            pnlVisualArt6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualArt6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage6)
                    .addComponent(lblTitle6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVisualArt6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblArtproductId6)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlVisualArt6Layout.setVerticalGroup(
            pnlVisualArt6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblTitle6)
                .addGap(24, 24, 24))
            .addGroup(pnlVisualArt6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt6Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(lblArtproductId6)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        pnlVisualArt7.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualArt7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlVisualArt7.setAlignmentX(0.2F);
        pnlVisualArt7.setAlignmentY(0.2F);

        lblImage7.setAlignmentX(0.2F);
        lblImage7.setAlignmentY(0.2F);
        lblImage7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImage7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisualArt7Layout = new javax.swing.GroupLayout(pnlVisualArt7);
        pnlVisualArt7.setLayout(pnlVisualArt7Layout);
        pnlVisualArt7Layout.setHorizontalGroup(
            pnlVisualArt7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualArt7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage7)
                    .addComponent(lblTitle7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVisualArt7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblArtproductId7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlVisualArt7Layout.setVerticalGroup(
            pnlVisualArt7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblTitle7)
                .addGap(24, 24, 24))
            .addGroup(pnlVisualArt7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt7Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(lblArtproductId7)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        pnlVisualArt8.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisualArt8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlVisualArt8.setAlignmentX(0.2F);
        pnlVisualArt8.setAlignmentY(0.2F);

        lblImage8.setAlignmentX(0.2F);
        lblImage8.setAlignmentY(0.2F);
        lblImage8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImage8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisualArt8Layout = new javax.swing.GroupLayout(pnlVisualArt8);
        pnlVisualArt8.setLayout(pnlVisualArt8Layout);
        pnlVisualArt8Layout.setHorizontalGroup(
            pnlVisualArt8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualArt8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage8)
                    .addComponent(lblTitle8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVisualArt8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblArtproductId8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlVisualArt8Layout.setVerticalGroup(
            pnlVisualArt8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArt8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblTitle8)
                .addGap(24, 24, 24))
            .addGroup(pnlVisualArt8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVisualArt8Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(lblArtproductId8)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlVisualArtMainLayout = new javax.swing.GroupLayout(pnlVisualArtMain);
        pnlVisualArtMain.setLayout(pnlVisualArtMainLayout);
        pnlVisualArtMainLayout.setHorizontalGroup(
            pnlVisualArtMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArtMainLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(pnlVisualArtMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVisualArtMainLayout.createSequentialGroup()
                        .addComponent(pnlVisualArt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(pnlVisualArt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(pnlVisualArt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(pnlVisualArt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(321, 321, 321)
                        .addComponent(lblMessage))
                    .addGroup(pnlVisualArtMainLayout.createSequentialGroup()
                        .addComponent(pnlVisualArt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(pnlVisualArt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(pnlVisualArt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(pnlVisualArt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(733, Short.MAX_VALUE))
        );
        pnlVisualArtMainLayout.setVerticalGroup(
            pnlVisualArtMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualArtMainLayout.createSequentialGroup()
                .addGroup(pnlVisualArtMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVisualArtMainLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlVisualArtMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlVisualArt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlVisualArt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlVisualArt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlVisualArt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlVisualArtMainLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblMessage)))
                .addGap(17, 17, 17)
                .addGroup(pnlVisualArtMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlVisualArt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVisualArt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVisualArt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVisualArt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(907, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlVisualArtMain);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1280, 390));

        lblAbout.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblAbout.setText("ABOUT");
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAboutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAboutMousePressed(evt);
            }
        });
        getContentPane().add(lblAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        pnlArtTypeMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlArtTypeMenu.setLayout(null);

        lblVisualArt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblVisualArt.setText("Visual Art");
        lblVisualArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVisualArtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVisualArtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVisualArtMousePressed(evt);
            }
        });
        pnlArtTypeMenu.add(lblVisualArt);
        lblVisualArt.setBounds(10, 10, 100, 23);

        lblSculpture.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblSculpture.setText("Sculpture");
        lblSculpture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSculptureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSculptureMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSculptureMousePressed(evt);
            }
        });
        pnlArtTypeMenu.add(lblSculpture);
        lblSculpture.setBounds(10, 40, 90, 20);

        lblContemporaryArt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblContemporaryArt.setText("Contemporary Art");
        lblContemporaryArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblContemporaryArtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblContemporaryArtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblContemporaryArtMousePressed(evt);
            }
        });
        pnlArtTypeMenu.add(lblContemporaryArt);
        lblContemporaryArt.setBounds(10, 70, 140, 16);

        getContentPane().add(pnlArtTypeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 170, 90));

        lblHome.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblHome.setText("HOME");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHomeMousePressed(evt);
            }
        });
        getContentPane().add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        lblArtType.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblArtType.setForeground(new java.awt.Color(255, 59, 159));
        lblArtType.setText("ART TYPE ");
        lblArtType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblArtTypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblArtTypeMouseExited(evt);
            }
        });
        getContentPane().add(lblArtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        lblEvent.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblEvent.setText("EVENT");
        lblEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEventMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEventMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEventMousePressed(evt);
            }
        });
        getContentPane().add(lblEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, -1));

        btnLogOut.setBackground(new java.awt.Color(242, 242, 242));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogOut.setText("LogOut");
        btnLogOut.setAlignmentX(0.1F);
        btnLogOut.setAlignmentY(0.1F);
        btnLogOut.setMaximumSize(new java.awt.Dimension(80, 28));
        btnLogOut.setMinimumSize(new java.awt.Dimension(80, 28));
        btnLogOut.setPreferredSize(new java.awt.Dimension(80, 28));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 2, 85, 28));

        lblBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Art Gallery Background new.png"))); // NOI18N
        lblBackGround.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackGroundMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblImage1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImage1MousePressed
        
        showArtDetails(lblArtproductId1.getText());
    }//GEN-LAST:event_lblImage1MousePressed
    
    public void showArtDetails(String strArtproductId) {
        
        ArtDetails ArtDetailsFrame = new ArtDetails();
        ArtDetailsFrame.getArtproductIdData(strArtproductId);
        ArtDetailsFrame.setVisible(true);
        ArtDetailsFrame.pack();
        ArtDetailsFrame.setExtendedState(ArtDetailsFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        ArtDetailsFrame.setLocationRelativeTo(null);
        this.dispose();
    }
    
    private void lblImage5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImage5MousePressed
        
        showArtDetails(lblArtproductId1.getText());
    }//GEN-LAST:event_lblImage5MousePressed

    private void lblAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseEntered
        
        lblAbout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblAbout.setForeground(new Color(255, 59, 159));
    }//GEN-LAST:event_lblAboutMouseEntered

    private void lblAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseExited
        
        lblAbout.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_lblAboutMouseExited

    private void lblAboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMousePressed
        
        AboutUs AboutUsFrame = new AboutUs();
        AboutUsFrame.setVisible(true);
        AboutUsFrame.pack();
        AboutUsFrame.setExtendedState(AboutUsFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        AboutUsFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblAboutMousePressed

    private void lblVisualArtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisualArtMouseEntered
        
        lblVisualArt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblVisualArt.setForeground(new Color(255, 59, 159));
    }//GEN-LAST:event_lblVisualArtMouseEntered

    private void lblVisualArtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisualArtMouseExited
        
        lblVisualArt.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_lblVisualArtMouseExited

    private void lblVisualArtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisualArtMousePressed
        
        VisualArt VisualsArtsFrame = new VisualArt();
        VisualsArtsFrame.setVisible(true);
        VisualsArtsFrame.pack();
        VisualsArtsFrame.setExtendedState(VisualsArtsFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        VisualsArtsFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblVisualArtMousePressed

    private void lblSculptureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSculptureMouseEntered
        
        lblSculpture.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblSculpture.setForeground(new Color(255, 59, 159));
    }//GEN-LAST:event_lblSculptureMouseEntered

    private void lblSculptureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSculptureMouseExited
        
        lblSculpture.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_lblSculptureMouseExited

    private void lblSculptureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSculptureMousePressed
        
        Sculpture SculptureFrame = new Sculpture();
        SculptureFrame.setVisible(true);
        SculptureFrame.pack();
        SculptureFrame.setExtendedState(SculptureFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        SculptureFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblSculptureMousePressed

    private void lblContemporaryArtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContemporaryArtMouseEntered
        
        lblContemporaryArt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblContemporaryArt.setForeground(new Color(255, 59, 159));
    }//GEN-LAST:event_lblContemporaryArtMouseEntered

    private void lblContemporaryArtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContemporaryArtMouseExited
        
        lblContemporaryArt.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_lblContemporaryArtMouseExited

    private void lblContemporaryArtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContemporaryArtMousePressed
        
        ContemporaryArt ContemporaryArtFrame = new ContemporaryArt();
        ContemporaryArtFrame.setVisible(true);
        ContemporaryArtFrame.pack();
        ContemporaryArtFrame.setExtendedState(ContemporaryArtFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        ContemporaryArtFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblContemporaryArtMousePressed

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        
        lblHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblHome.setForeground(new Color(255, 59, 159));

    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        
        lblHome.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_lblHomeMouseExited

    private void lblHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMousePressed
        
        UserDashboard UserDashboardFrame = new UserDashboard();
        UserDashboardFrame.setUserValues(ArtHive.staticUserName);
        UserDashboardFrame.setVisible(true);
        
        UserDashboardFrame.pack();
        UserDashboardFrame.setExtendedState(UserDashboardFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        UserDashboardFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblHomeMousePressed

    private void lblArtTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArtTypeMouseEntered
        
        lblArtType.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblArtType.setForeground(new Color(255, 59, 159));
        pnlArtTypeMenu.setVisible(true);
    }//GEN-LAST:event_lblArtTypeMouseEntered

    private void lblArtTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArtTypeMouseExited
        
        lblArtType.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_lblArtTypeMouseExited

    private void lblBackGroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackGroundMouseClicked
        
        pnlArtTypeMenu.setVisible(false);
    }//GEN-LAST:event_lblBackGroundMouseClicked

    private void lblImage2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImage2MousePressed
        
        showArtDetails(lblArtproductId1.getText());
    }//GEN-LAST:event_lblImage2MousePressed

    private void lblImage3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImage3MousePressed
        
        showArtDetails(lblArtproductId1.getText());
    }//GEN-LAST:event_lblImage3MousePressed

    private void lblImage4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImage4MousePressed
        
        showArtDetails(lblArtproductId1.getText());
    }//GEN-LAST:event_lblImage4MousePressed

    private void lblImage6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImage6MousePressed
        
        showArtDetails(lblArtproductId1.getText());
    }//GEN-LAST:event_lblImage6MousePressed

    private void lblImage7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImage7MousePressed
        
        showArtDetails(lblArtproductId1.getText());
    }//GEN-LAST:event_lblImage7MousePressed

    private void lblImage8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImage8MousePressed
        
        showArtDetails(lblArtproductId1.getText());
    }//GEN-LAST:event_lblImage8MousePressed

    private void lblEventMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventMouseEntered
        
        lblEvent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblEvent.setForeground(new Color(255, 59, 159));
    }//GEN-LAST:event_lblEventMouseEntered

    private void lblEventMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventMouseExited
        
        lblEvent.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_lblEventMouseExited

    private void lblEventMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventMousePressed
        
        Event EventFrame = new Event();
        EventFrame.setVisible(true);
        EventFrame.pack();
        EventFrame.setExtendedState(EventFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        EventFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblEventMousePressed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed

        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setExtendedState(LoginFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblArtType;
    private javax.swing.JLabel lblArtproductId1;
    private javax.swing.JLabel lblArtproductId2;
    private javax.swing.JLabel lblArtproductId3;
    private javax.swing.JLabel lblArtproductId4;
    private javax.swing.JLabel lblArtproductId5;
    private javax.swing.JLabel lblArtproductId6;
    private javax.swing.JLabel lblArtproductId7;
    private javax.swing.JLabel lblArtproductId8;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblContemporaryArt;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblImage2;
    private javax.swing.JLabel lblImage3;
    private javax.swing.JLabel lblImage4;
    private javax.swing.JLabel lblImage5;
    private javax.swing.JLabel lblImage6;
    private javax.swing.JLabel lblImage7;
    private javax.swing.JLabel lblImage8;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSculpture;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblTitle4;
    private javax.swing.JLabel lblTitle5;
    private javax.swing.JLabel lblTitle6;
    private javax.swing.JLabel lblTitle7;
    private javax.swing.JLabel lblTitle8;
    private javax.swing.JLabel lblVisualArt;
    private javax.swing.JPanel pnlArtTypeMenu;
    private javax.swing.JPanel pnlVisualArt1;
    private javax.swing.JPanel pnlVisualArt2;
    private javax.swing.JPanel pnlVisualArt3;
    private javax.swing.JPanel pnlVisualArt4;
    private javax.swing.JPanel pnlVisualArt5;
    private javax.swing.JPanel pnlVisualArt6;
    private javax.swing.JPanel pnlVisualArt7;
    private javax.swing.JPanel pnlVisualArt8;
    private javax.swing.JPanel pnlVisualArtMain;
    // End of variables declaration//GEN-END:variables
}
