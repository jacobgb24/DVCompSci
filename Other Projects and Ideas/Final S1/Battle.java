import java.util.Random;
import javax.swing.ImageIcon;

public class Battle extends javax.swing.JFrame {
    Saves sav = new Saves();
    Monster enemy = new Monster(50, 0, 5);
    Combat player = new Combat(100, 1, 10, 3);
    //Gets the images
	ImageIcon playerImg = new ImageIcon(getClass().getResource("resources/playerModel.png"));
    ImageIcon enemyImg = new ImageIcon(getClass().getResource("resources/enemyModel.png"));
    int level = 1;
    
	/**
     * Creates new form Battle
     */
    public Battle() {
        initComponents();
    }

    //Creates all of the visual elements
    @SuppressWarnings("unchecked")
    private void initComponents() {

        playerHealthBar = new javax.swing.JProgressBar();
        enemyHealthBar = new javax.swing.JProgressBar();
        playerManaBar = new javax.swing.JProgressBar();
        enemyManaBar = new javax.swing.JProgressBar();
        playerTitleLabel = new javax.swing.JLabel();
        enemyTitleLabel = new javax.swing.JLabel();
        playerIcon = new javax.swing.JLabel();
        enemyIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();
        attackButton = new javax.swing.JButton();
        magicButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        lvlTitle = new javax.swing.JLabel();
        playerStats = new javax.swing.JLabel();
        enemyStats = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Battle");

        playerHealthBar.setBackground(java.awt.Color.red);
        playerHealthBar.setForeground(java.awt.Color.darkGray);
        playerHealthBar.setValue(100);
        playerHealthBar.setString("Health");
        playerHealthBar.setStringPainted(true);

        enemyHealthBar.setMaximum(50);
        enemyHealthBar.setValue(50);
        enemyHealthBar.setStringPainted(true);
        enemyHealthBar.setString("Health");

        playerManaBar.setMaximum(3);
        playerManaBar.setValue(3);
        playerManaBar.setString("Mana: "+player.getMana());
        playerManaBar.setStringPainted(true);

        playerTitleLabel.setText("Player");

        enemyTitleLabel.setText("Enemy");

        playerIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerIcon.setIcon(playerImg);

        enemyIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enemyIcon.setIcon(enemyImg);

        log.setColumns(20);
        log.setRows(5);
        jScrollPane1.setViewportView(log);

        attackButton.setText("Attack");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        magicButton.setText("Fireball");
        magicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magicButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next Battle");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        lvlTitle.setText("Level 1");

        playerStats.setText("Armor: 1   Damage: 10");

        enemyStats.setText("Armor: 0   Damage: 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerManaBar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enemyTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyManaBar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lvlTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(enemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackButton)
                            .addComponent(magicButton)
                            .addComponent(playerStats))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enemyStats)
                            .addComponent(nextButton)
                            .addComponent(enemyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loadButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerManaBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enemyManaBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerTitleLabel)
                    .addComponent(enemyTitleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(enemyIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerStats)
                    .addComponent(enemyStats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attackButton)
                    .addComponent(nextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(magicButton)
                    .addComponent(saveButton)
                    .addComponent(loadButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
    
	//Increases player's stats after a battle
    public void reward(){
        Random rand = new Random();
        int item = rand.nextInt(5);
        if(item==0){
            player.setDamage(1);
            log.append("You found a sword (+1 attack)\n");
        }
        else if(item==1){
            player.setDefense(1);
            log.append("You found some armor (+1 defense)\n");
        }
        else if(item==2){
            player.setMaxHealth(10);
            log.append("You found a health potion (+10 max health)\n");
            playerHealthBar.setValue(player.getMaxHealth());
            playerHealthBar.setString("Health:"+player.getMaxHealth());
        }
        else if(item==3){
            player.useMana(-2);
            log.append("You found a mana potion (+2 mana)\n");
            playerManaBar.setValue(player.getMana());
            playerManaBar.setString("Mana: "+player.getMana());
        }
        else
            log.append("You didn't find anything\n");
        playerStats.setText("Armor: "+player.getDefense()+"   Damage: "+player.getDamage());
    }
    
	//Enemy does damage to the player
    public void enemyTurn(){
        int enemyDamageDealt = enemy.getDamage()-player.getDefense();
        player.changeHealth(-enemyDamageDealt);
        playerHealthBar.setValue(player.getHealth());
        playerHealthBar.setString("Health:"+player.getHealth());
        log.append("Enemy dealt "+enemyDamageDealt+" damage to the player\n");
        
		//Disables all the buttons if you die
		if(player.getHealth()<=0){
            log.append("\nYou were defeated");
            nextButton.setEnabled(false);
            magicButton.setEnabled(false);
            saveButton.setEnabled(false);
            attackButton.setEnabled(false);
            loadButton.setEnabled(false);
        }
    }
	
	//Player deals damage to the enemy
    public void damageEnemy(int damage){
        enemy.changeHealth(-damage);
        enemyHealthBar.setValue(enemy.getHealth());
        enemyHealthBar.setString("Health:"+enemy.getHealth());
        log.append("Player dealt "+damage+" damage to the enemy\n");
        
		//Checks to see if the enemy is dead
		if(enemy.getHealth()<=0){
            attackButton.setEnabled(false);
            magicButton.setEnabled(false);
            enemyIcon.setIcon(null);
            log.append("Player defeated the enemy!\n");
            log.append("You have beaten level "+level+"\n");
            level++;
            reward();
            nextButton.setEnabled(true);
            if(level==6){
                log.append("\n\n\nYOU HAVE DEFEATED THE BOSS AND WON THE GAME\n");
                log.append("You can continue to play, if you want\n");
            }
        }
        else{
            enemyTurn();}
    }
    
	//When attack button is pressed
    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int damageDealt = player.getDamage()-enemy.getDefense();
        damageEnemy(damageDealt);
    }
	
	//When fireball button is pressed
    private void magicButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //Makes sure player has enough mana
		if(player.getMana()>0){
            damageEnemy(25);
            player.useMana(1);
            playerManaBar.setValue(player.getMana());
            playerManaBar.setString("Mana: "+player.getMana());
        }
        else{
            log.append("Not enough mana\n");
        }
    }
	
	//Starts new battle
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {
        nextButton.setEnabled(false); 
        attackButton.setEnabled(true);
        magicButton.setEnabled(true);
        lvlTitle.setText("Level "+level);
        if(level==5)
            lvlTitle.setText("BOSS");
        
		//Puts player back to full health
        player.changeHealth(player.getMaxHealth()-player.getHealth());
        Monster enemy = new Monster(50+(10*level), level, 5+level);
        
		//Syncs all the visual values
        enemyStats.setText("Armor: "+enemy.getDefense()+"   Damage: "+enemy.getDamage());
        enemyIcon.setIcon(enemyImg);
        enemyHealthBar.setMaximum(enemy.getHealth());
        enemyHealthBar.setValue(enemy.getHealth());
        playerHealthBar.setValue(player.getHealth());
    }
	
	//Writes all the stats to a file
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        sav.save("lvl", ""+level);
        sav.save("mana", ""+player.getMana());
        sav.save("att", ""+player.getDamage());
        sav.save("def", ""+player.getDefense());
        sav.save("health", ""+player.getMaxHealth());
        log.append("Game saved!\n");
    }
	
	//Loads all the saved data, and starts the proper level
    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {
		level = sav.load("lvl");
		if(level==0)
			log.append("No save file found\n");
		
		else{
        player.useMana(3-sav.load("mana"));
        player.setDamage(sav.load("att")-10);
        player.setDefense(sav.load("def")-1);
        player.setMaxHealth(sav.load("health")-100);
        
        lvlTitle.setText("Level "+level);
        if(level==5)
            lvlTitle.setText("BOSS");
        playerStats.setText("Armor: "+player.getDefense()+"   Damage: "+player.getDamage());
        player.changeHealth(player.getMaxHealth()-player.getHealth());
        
        Monster enemy = new Monster(50+(10*level), level, 5+level);
        enemyStats.setText("Armor: "+enemy.getDefense()+"   Damage: "+enemy.getDamage());
        enemyHealthBar.setMaximum(enemy.getHealth());
        enemyHealthBar.setValue(enemy.getHealth());
        
        log.append("Loading complete\n");
		}
    }
    
    /**
     * @param args the command line arguments
     */
	//Creates the GUI
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Battle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackButton;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel enemyIcon;
    private javax.swing.JProgressBar enemyManaBar;
    private javax.swing.JLabel enemyStats;
    private javax.swing.JLabel enemyTitleLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextArea log;
    private javax.swing.JLabel lvlTitle;
    private javax.swing.JButton magicButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JProgressBar playerHealthBar;
    private javax.swing.JLabel playerIcon;
    private javax.swing.JProgressBar playerManaBar;
    private javax.swing.JLabel playerStats;
    private javax.swing.JLabel playerTitleLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
