package contadorJogos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class ContadorDeJogos {

	private JFrame frame;
	private JTextField totalJogos;
	private JTextField jogosGanho;
	private JTextField jogosPerdidos;
	private JTextField txtTotalDeJogos;
	private JTextField txtJogosGanho;
	private JTextField txtJogosPerdido;
	
	int totalJogosFeitos;
	int jogosGanhoTotal;
	int jogosPerdidoTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContadorDeJogos window = new ContadorDeJogos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContadorDeJogos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		totalJogos = new JTextField();
		totalJogos.setBorder(null);
		totalJogos.setDisabledTextColor(new Color(0, 0, 0));
		totalJogos.setEditable(false);
		totalJogos.setBackground(new Color(255, 255, 255));
		totalJogos.setHorizontalAlignment(SwingConstants.CENTER);
		totalJogos.setText("0");
		totalJogos.setColumns(10);
		
		jogosGanho = new JTextField();
		jogosGanho.setHorizontalAlignment(SwingConstants.CENTER);
		jogosGanho.setBorder(null);
		jogosGanho.setText("0");
		jogosGanho.setColumns(10);
		
		JButton addJogosGanho = new JButton("+");
		addJogosGanho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalJogosFeitos += 1;
				jogosGanhoTotal += 1;
				totalJogos.setText("" + totalJogosFeitos);
				jogosGanho.setText("" + jogosGanhoTotal);
			}
		});
		addJogosGanho.setBorder(null);
		addJogosGanho.setPreferredSize(new Dimension(37, 23));
		
		JButton dimJogosGanho = new JButton("-");
		dimJogosGanho.setBorder(null);
		dimJogosGanho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jogosGanhoTotal == 0) {
					return;
				}
				totalJogosFeitos -= 1;
				jogosGanhoTotal -= 1;
				totalJogos.setText("" + totalJogosFeitos);
				jogosGanho.setText("" + jogosGanhoTotal);
			}
		});
		dimJogosGanho.setPreferredSize(new Dimension(37, 23));
		dimJogosGanho.setMinimumSize(new Dimension(37, 23));
		
		jogosPerdidos = new JTextField();
		jogosPerdidos.setHorizontalAlignment(SwingConstants.CENTER);
		jogosPerdidos.setBorder(null);
		jogosPerdidos.setText("0");
		jogosPerdidos.setColumns(10);
		
		JButton dimJogosPerdido = new JButton("-");
		dimJogosPerdido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jogosPerdidoTotal == 0) {
					return;
				}
				totalJogosFeitos -= 1;
				jogosPerdidoTotal -= 1;
				totalJogos.setText("" + totalJogosFeitos);
				jogosPerdidos.setText("" + jogosPerdidoTotal);
			}
		});
		dimJogosPerdido.setBorder(null);
		dimJogosPerdido.setPreferredSize(new Dimension(37, 23));
		dimJogosPerdido.setMinimumSize(new Dimension(37, 23));
		
		JButton addJogosPerdido = new JButton("+");
		addJogosPerdido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalJogosFeitos += 1;
				jogosPerdidoTotal += 1;
				totalJogos.setText("" + totalJogosFeitos);
				jogosPerdidos.setText("" + jogosPerdidoTotal);
			}
		});
		addJogosPerdido.setBorder(null);
		addJogosPerdido.setPreferredSize(new Dimension(37, 23));
		
		txtTotalDeJogos = new JTextField();
		txtTotalDeJogos.setBackground(new Color(255, 255, 255));
		txtTotalDeJogos.setDisabledTextColor(new Color(0, 0, 0));
		txtTotalDeJogos.setEditable(false);
		txtTotalDeJogos.setEnabled(false);
		txtTotalDeJogos.setBorder(null);
		txtTotalDeJogos.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalDeJogos.setText("Total de Jogos");
		txtTotalDeJogos.setColumns(10);
		
		txtJogosGanho = new JTextField();
		txtJogosGanho.setDisabledTextColor(new Color(0, 0, 0));
		txtJogosGanho.setBackground(new Color(255, 255, 255));
		txtJogosGanho.setEnabled(false);
		txtJogosGanho.setEditable(false);
		txtJogosGanho.setBorder(null);
		txtJogosGanho.setHorizontalAlignment(SwingConstants.CENTER);
		txtJogosGanho.setText("Jogos Ganho");
		txtJogosGanho.setColumns(10);
		
		txtJogosPerdido = new JTextField();
		txtJogosPerdido.setDisabledTextColor(new Color(0, 0, 0));
		txtJogosPerdido.setBackground(new Color(255, 255, 255));
		txtJogosPerdido.setEnabled(false);
		txtJogosPerdido.setEditable(false);
		txtJogosPerdido.setBorder(null);
		txtJogosPerdido.setHorizontalAlignment(SwingConstants.CENTER);
		txtJogosPerdido.setText("Jogos Perdido");
		txtJogosPerdido.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(2)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(totalJogos, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
						.addComponent(txtTotalDeJogos, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(addJogosGanho, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
											.addGap(6)
											.addComponent(dimJogosGanho, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
										.addComponent(jogosGanho, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
								.addComponent(txtJogosGanho, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtJogosPerdido, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
									.addContainerGap())
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(addJogosPerdido, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(dimJogosPerdido, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
								.addComponent(jogosPerdidos, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtTotalDeJogos, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(totalJogos, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtJogosPerdido, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
						.addComponent(txtJogosGanho))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jogosPerdidos, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(dimJogosPerdido, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(addJogosPerdido, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jogosGanho, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(dimJogosGanho, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(addJogosGanho, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))))
					.addGap(17))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
