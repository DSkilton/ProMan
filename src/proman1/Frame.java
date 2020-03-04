/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proman1;

/**
 *
 * @author MC03353
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField2 = new java.awt.TextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        textField5 = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        textField7 = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        list2 = new java.awt.List();
        list3 = new java.awt.List();
        jLabel5 = new javax.swing.JLabel();
        textField8 = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        mainPanel = new javax.swing.JPanel();
        java.awt.Label lTitle = new java.awt.Label();
        label1 = new java.awt.Label();
        lClientName = new java.awt.Label();
        lProjectPrice = new java.awt.Label();
        String sProjectName = null;
        tFProjectName = new java.awt.TextField();
        tFClientName = new java.awt.TextField();
        tFProjectPrice = new java.awt.TextField();
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("mm/dd/yy");
        jFTDate = new javax.swing.JFormattedTextField(format);
        jLProjectDeadline = new javax.swing.JLabel();
        rBApp = new javax.swing.JRadioButton();
        jLProjectType = new javax.swing.JLabel();
        rBGame = new javax.swing.JRadioButton();
        rBWebsite = new javax.swing.JRadioButton();
        jPApp = new javax.swing.JPanel();
        jLProjectType1 = new javax.swing.JLabel();
        rbAndroid = new javax.swing.JRadioButton();
        rBIos = new javax.swing.JRadioButton();
        rbOther = new javax.swing.JRadioButton();
        jPGame = new javax.swing.JPanel();
        tFPlatform = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        lGenre = new java.awt.List();
        jLabel2 = new javax.swing.JLabel();
        jPWebsite = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tFServerAddress = new java.awt.TextField();
        tFNumberPages = new java.awt.TextField();
        label2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        btnCollate = new java.awt.Button();

        textField2.setText("textField1");

        textField5.setText("textField1");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Platform");

        textField7.setText("Enter Platform");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Genre");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Genre");

        textField8.setText("Enter Platform");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Platform");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lTitle.setText("ProManager");

        label1.setText("Enter a Project Name:");

        lClientName.setText("Enter a Client Name:");

        lProjectPrice.setText("Enter Project Price (£):");

        tFProjectName.setName(""); // NOI18N
        tFProjectName.setText("Enter a project name");
        tFProjectName.setText("");
        tFProjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFProjectNameActionPerformed(evt);
            }
        });

        tFClientName.setText("");
        tFClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFClientNameActionPerformed(evt);
            }
        });

        tFProjectPrice.setText("");
        tFProjectPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFProjectPriceActionPerformed(evt);
            }
        });

        jFTDate.setText("dd/mm/yy");
        jFTDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTDateActionPerformed(evt);
            }
        });

        jLProjectDeadline.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLProjectDeadline.setText("Enter Project Deadline:");
        jLProjectDeadline.setToolTipText("");
        jLProjectDeadline.setName(""); // NOI18N

        buttonGroup1.add(rBApp);
        rBApp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rBApp.setText("App");
        rBApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBAppActionPerformed(evt);
            }
        });

        jLProjectType.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLProjectType.setText("Enter Project Type:");
        jLProjectType.setToolTipText("");
        jLProjectType.setName(""); // NOI18N

        buttonGroup1.add(rBGame);
        rBGame.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rBGame.setText("Game");
        rBGame.setActionCommand("");
        rBGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBGameActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBWebsite);
        rBWebsite.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rBWebsite.setText("Website");
        rBWebsite.setActionCommand("");
        rBWebsite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBWebsiteActionPerformed(evt);
            }
        });

        jPApp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "App", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPApp.setEnabled(false);
        jPApp.setMinimumSize(new java.awt.Dimension(163, 230));
        jPApp.setPreferredSize(new java.awt.Dimension(163, 230));

        jLProjectType1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLProjectType1.setText("Platform:");
        jLProjectType1.setToolTipText("");
        jLProjectType1.setName(""); // NOI18N

        buttonGroup2.add(rbAndroid);
        rbAndroid.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbAndroid.setText("Android");
        rbAndroid.setActionCommand("");
        rbAndroid.setEnabled(false);
        rbAndroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAndroidActionPerformed(evt);
            }
        });

        buttonGroup2.add(rBIos);
        rBIos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rBIos.setText("iOS");
        rBIos.setEnabled(false);
        rBIos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBIosActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbOther);
        rbOther.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbOther.setText("Other");
        rbOther.setActionCommand("");
        rbOther.setEnabled(false);
        rbOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOtherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAppLayout = new javax.swing.GroupLayout(jPApp);
        jPApp.setLayout(jPAppLayout);
        jPAppLayout.setHorizontalGroup(
            jPAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAppLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbOther)
                    .addComponent(rbAndroid)
                    .addComponent(rBIos)
                    .addComponent(jLProjectType1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPAppLayout.setVerticalGroup(
            jPAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLProjectType1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rBIos)
                .addGap(18, 18, 18)
                .addComponent(rbAndroid)
                .addGap(18, 18, 18)
                .addComponent(rbOther)
                .addGap(56, 56, 56))
        );

        jPGame.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Game", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPGame.setEnabled(false);
        jPGame.setMinimumSize(new java.awt.Dimension(163, 230));

        tFPlatform.setEnabled(false);
        tFPlatform.setText("Enter Platform");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Platform:");

        lGenre.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Genre:");

        javax.swing.GroupLayout jPGameLayout = new javax.swing.GroupLayout(jPGame);
        jPGame.setLayout(jPGameLayout);
        jPGameLayout.setHorizontalGroup(
            jPGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lGenre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tFPlatform, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addGroup(jPGameLayout.createSequentialGroup()
                        .addGroup(jPGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPGameLayout.setVerticalGroup(
            jPGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGameLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFPlatform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPWebsite.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Website", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPWebsite.setEnabled(false);
        jPWebsite.setMinimumSize(new java.awt.Dimension(163, 230));
        jPWebsite.setPreferredSize(new java.awt.Dimension(163, 230));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Number of Pages:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Server Name:");

        tFServerAddress.setEnabled(false);
        tFServerAddress.setText("Enter Address");

        tFNumberPages.setEnabled(false);
        tFNumberPages.setText("Enter a number");

        javax.swing.GroupLayout jPWebsiteLayout = new javax.swing.GroupLayout(jPWebsite);
        jPWebsite.setLayout(jPWebsiteLayout);
        jPWebsiteLayout.setHorizontalGroup(
            jPWebsiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPWebsiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPWebsiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tFServerAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPWebsiteLayout.createSequentialGroup()
                        .addGroup(jPWebsiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addComponent(tFNumberPages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPWebsiteLayout.setVerticalGroup(
            jPWebsiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPWebsiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFServerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFNumberPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        label2.setText("Project Details:");

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jTextArea.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextAreaPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea);

        button1.setLabel("Quit");
        button1.setName(""); // NOI18N

        button2.setLabel("Clear");
        button2.setName(""); // NOI18N

        button3.setLabel("Add Project");
        button3.setName(""); // NOI18N

        btnCollate.setLabel("Collate");
        btnCollate.setName(""); // NOI18N
        btnCollate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(lProjectPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tFProjectPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(lClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tFClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tFProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(13, 13, 13)
                            .addComponent(jLProjectDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFTDate))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                    .addComponent(jPApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                    .addGap(321, 321, 321)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLProjectType, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(rBApp)
                                            .addGap(18, 18, 18)
                                            .addComponent(rBGame)
                                            .addGap(18, 18, 18)
                                            .addComponent(rBWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCollate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tFProjectName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLProjectDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tFClientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLProjectType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lProjectPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFProjectPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rBApp)
                        .addComponent(rBGame)
                        .addComponent(rBWebsite)))
                .addGap(28, 28, 28)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCollate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        label1.getAccessibleContext().setAccessibleName("lProjectName");
        jLProjectType.getAccessibleContext().setAccessibleName("Project Type: ");
        label2.getAccessibleContext().setAccessibleName("Project Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //if the App radio button is selected, allows access to panel and contents
    void rBAppTrue(){
        jPApp.setEnabled(true);
        rBIos.setEnabled(true);
        rbAndroid.setEnabled(true);
        rbOther.setEnabled(true);
    }
    
    //if the App radio button isn't selected, stops access to panel and contents    
    void rBAppFalse(){
        jPApp.setEnabled(false);
        rBIos.setEnabled(false);
        rbAndroid.setEnabled(false);
        rbOther.setEnabled(false);
    }
    
    void rBGameTrue(){
        jPGame.setEnabled(true);
        tFPlatform.setEnabled(true);
        lGenre.setEnabled(true);
    }
    
    void rBGameFalse(){
        jPGame.setEnabled(false);
        tFPlatform.setEnabled(false);
        lGenre.setEnabled(false);      
    }
    
    void rBWebsiteTrue(){
        jPWebsite.setEnabled(true);
        tFServerAddress.setEnabled(true);
        tFNumberPages.setEnabled(true);    
    }
    
    void rBWebsiteFalse(){
        jPWebsite.setEnabled(false);
        tFServerAddress.setEnabled(false);
        tFNumberPages.setEnabled(false);
    }
    private void rBAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBAppActionPerformed
        if(rBApp.isSelected()){
            GetAndSet.setsProjectType("App");
            rBAppTrue();
            rBGameFalse();
            rBWebsiteFalse();
        }
    }//GEN-LAST:event_rBAppActionPerformed

    private void rBGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBGameActionPerformed
        if(rBGame.isSelected()){
            GetAndSet.setsProjectType("Game");
            rBAppFalse();
            rBGameTrue();
            rBWebsiteTrue();
        }
    }//GEN-LAST:event_rBGameActionPerformed

    private void rBWebsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBWebsiteActionPerformed
        if(rBWebsite.isSelected()){
            GetAndSet.setsProjectType("Website");
            rBAppFalse();
            rBGameFalse();
            rBWebsiteTrue();
        }
    }//GEN-LAST:event_rBWebsiteActionPerformed

    private void rbAndroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAndroidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAndroidActionPerformed

    private void rBIosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBIosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBIosActionPerformed

    private void rbOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOtherActionPerformed

    private void tFProjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFProjectNameActionPerformed
        GetAndSet.setProjectName(tFProjectName.getText());
    }//GEN-LAST:event_tFProjectNameActionPerformed

    private void jFTDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTDateActionPerformed

    private void jTextAreaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextAreaPropertyChange
        jTextArea.setText("Project Title: \n"
                    + "Date: \n"
                    + "Project Price: £\n"
                    + "Client Name: \n");
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
    }//GEN-LAST:event_jTextAreaPropertyChange

    private void tFClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFClientNameActionPerformed

    }//GEN-LAST:event_tFClientNameActionPerformed

    private void btnCollateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollateActionPerformed
        jTextArea.setText("Project Title: " + tFProjectName.getText() + "\n"
                        + "Date: " + jFTDate.getText() + "\n" 
                        + "Project Price £" + tFProjectPrice.getText() + "\n"
                        + "Client Name: " + tFClientName.getText() + "\n"
                        + "Project Type: " + GetAndSet.getsProjectType());
        System.out.println(GetAndSet.getProjectName());
    }//GEN-LAST:event_btnCollateActionPerformed

    private void tFProjectPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFProjectPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFProjectPriceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCollate;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFormattedTextField jFTDate;
    private javax.swing.JLabel jLProjectDeadline;
    private javax.swing.JLabel jLProjectType;
    private javax.swing.JLabel jLProjectType1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPApp;
    private javax.swing.JPanel jPGame;
    private javax.swing.JPanel jPWebsite;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private java.awt.Label lClientName;
    private java.awt.List lGenre;
    private java.awt.Label lProjectPrice;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.List list2;
    private java.awt.List list3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton rBApp;
    private javax.swing.JRadioButton rBGame;
    private javax.swing.JRadioButton rBIos;
    private javax.swing.JRadioButton rBWebsite;
    private javax.swing.JRadioButton rbAndroid;
    private javax.swing.JRadioButton rbOther;
    private java.awt.TextField tFClientName;
    private java.awt.TextField tFNumberPages;
    private java.awt.TextField tFPlatform;
    private java.awt.TextField tFProjectName;
    private java.awt.TextField tFProjectPrice;
    private java.awt.TextField tFServerAddress;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField5;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    // End of variables declaration//GEN-END:variables
}
