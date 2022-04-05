import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class VentanaPrincipal {
	private JFrame frmMarcoDeFunciones;
	double conjunto1[], conjunto2[], conjunto3[], conjunto4[];
	int NumerosTotales = 0, SeleccionUsuario = 0, NumConjuntos = 0;
	int b = 1;// num control conjuntos
	int a = 1;// num control numeros
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	boolean exit= false;
	String Resultado="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmMarcoDeFunciones.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMarcoDeFunciones = new JFrame();
		frmMarcoDeFunciones.setIconImage(
				Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/images/pleca_cenidet.jpg")));
		frmMarcoDeFunciones.setForeground(Color.BLACK);
		frmMarcoDeFunciones.setTitle("Marco de funciones de cálculo de las operaciones estadísticas");
		frmMarcoDeFunciones.setBounds(100, 100, 500, 525);
		frmMarcoDeFunciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Marco de funciones de cálculo de operaciones estadísticas");

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/pleca_tecnm.jpg")));

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/pleca_cenidet.jpg")));

		textField = new JTextField();
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Aceptar");

		JLabel lblNewLabel_4 = new JLabel("Ingresa el # de conjuntos a ingresar 1-4");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JButton btnNewButton_1 = new JButton("Aceptar");

		JLabel lblNewLabel_4_1 = new JLabel("<html>Ingresa la cantidad de numeros <br>por conjunto a ingresar<html>");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JButton btnNewButton_1_1 = new JButton("Aceptar");

		JLabel lblNewLabel_4_1_1 = new JLabel("<html>Ingresa el numero"+a+"<br> del conjunto"+b+"<html>");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		JButton btnNewButton_1_1_1 = new JButton("Añadir Numero");

		JLabel lblNewLabel_5 = new JLabel(
				"<html>Selecciona la opcion deseada <br>" + "1-Calcular Media<br>" + "2-Calcular Mediana<br>"
						+ "3-Calcular Moda<br>" + "4-Calcular Media Geométrica<br>" + "5-Calcular Media Armónica<br>"
						+ "6-Calcular Rango<br>" + "7-Calcular Varianza<br>" + "8-Calcular Desviación Estándar<br>"
						+ "9-Calcular Correlación<br>" + "10-Calcular Regresión Multifactorial<br>"
						+ "11-Calcular Integración Simpson<br>" + "12-Calcular Distribución Normal<br>"
						+ "13-Calcular Distribución T Student<br>" + "14-Calcular Distribución Chi Cuadrada<html>");

		JLabel lblNewLabel_6 = new JLabel("                 .");

		JButton btnNewButton_2 = new JButton("Calcular Resultado");
		

		GroupLayout groupLayout = new GroupLayout(frmMarcoDeFunciones.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_2))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(btnNewButton))
										.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(6)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(btnNewButton_1))
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(btnNewButton_1_1))
													.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(btnNewButton_1_1_1))
													.addComponent(lblNewLabel_4)
													.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
													.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(55)
											.addComponent(btnNewButton_2)))))
							.addGap(16))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(lblNewLabel)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_4_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_1_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton))
							.addGap(20)))
					.addContainerGap())
		);
		frmMarcoDeFunciones.getContentPane().setLayout(groupLayout);
		// Deshabilitando los botones no validos
		textField_3.setEnabled(false);
		textField_2.setEnabled(false);
		textField_1.setEnabled(false);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1_1.setEnabled(false);
		btnNewButton_2.setEnabled(false);
		// Boton seleccion de calculos
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionUsuario = Integer.parseInt(textField.getText());

				if(SeleccionUsuario>10) {
					textField.setEnabled(false);
					btnNewButton.setEnabled(false);
					btnNewButton_2.setEnabled(true);
				}else {
					if(SeleccionUsuario!=6||SeleccionUsuario!=9||SeleccionUsuario!=10) {
						textField_1.setText("1");
						NumConjuntos=1;
						textField.setEnabled(false);
						btnNewButton.setEnabled(false);
						textField_2.setEnabled(true);
						btnNewButton_1_1.setEnabled(true);
					}
					if(SeleccionUsuario==10) {
						textField_1.setText("4");
						NumConjuntos=4;
						textField.setEnabled(false);
						btnNewButton.setEnabled(false);
						textField_2.setEnabled(true);
						btnNewButton_1_1.setEnabled(true);
					}
					if(SeleccionUsuario==6||SeleccionUsuario==9){
						textField_1.setText("2");
						NumConjuntos=2;
						textField.setEnabled(false);
						btnNewButton.setEnabled(false);
						textField_2.setEnabled(true);
						btnNewButton_1_1.setEnabled(true);
					}
					
				}
				
			}
		});
		// Boton # de conjuntos
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumConjuntos = Integer.parseInt(textField_1.getText());
				textField_1.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				textField_2.setEnabled(true);
				btnNewButton_1_1.setEnabled(true);
			}
		});
		// Boton cantidad numeros en conjuntos
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumerosTotales = Integer.parseInt(textField_2.getText());
				textField_2.setEnabled(false);
				btnNewButton_1_1.setEnabled(false);
				textField_3.setEnabled(true);
				btnNewButton_1_1_1.setEnabled(true);
				conjunto1=new double[NumerosTotales];
				conjunto2=new double[NumerosTotales];
				conjunto3=new double[NumerosTotales];
				conjunto4=new double[NumerosTotales];
			}
		});
		// Boton Calcular/Anadir Numero
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a numeros NumerosTotales
				//b conjuntos NumConjuntos

				if(a<=NumerosTotales&&b==4&&exit!=true) {
					conjunto4[a-1] = Double.parseDouble(textField_3.getText());
					a++;
					if(a>NumerosTotales && b==NumConjuntos) {
						exit=true;
					}
					if(a>NumerosTotales) {
						a=1;
						b++;
						exit=true;
					}
					}

				if(a<=NumerosTotales&&b==3&&exit!=true) {
					conjunto3[a-1] = Double.parseDouble(textField_3.getText());
					a++;
					if(a>NumerosTotales && b==NumConjuntos) {
						exit=true;
					}
					if(a>NumerosTotales) {
						a=1;
						b++;
					}
					}
				if(a<=NumerosTotales&&b==2&&exit!=true) {
					conjunto2[a-1] = Double.parseDouble(textField_3.getText());
					a++;
					if(a>NumerosTotales && b==NumConjuntos) {
						exit=true;
					}
					if(a>NumerosTotales) {
						a=1;
						b++;
					}
					}
				if(a<=NumerosTotales&&b==1&&exit!=true) {
				conjunto1[a-1] = Double.parseDouble(textField_3.getText());
				a++;
				if(a>NumerosTotales && b==NumConjuntos) {
					exit=true;
				}
				if(a>NumerosTotales) {
					a=1;
					b++;
				}
				}
				lblNewLabel_4_1_1.setText("<html>Ingresa el numero "+a+"<br> del conjunto "+b+"<html>");
				if(exit==true) {
					textField_3.setEnabled(false);
					btnNewButton_1_1_1.setEnabled(false);
					btnNewButton_2.setEnabled(true);
					lblNewLabel_4_1_1.setText("Da clic en calcular resultado");
				}
				textField_3.setText("");
			}
		});
		//Boton Calcular
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(SeleccionUsuario) {
				case 1://Media
					OperacionesBasicas Media=new OperacionesBasicas();
					//Resultado=String.valueOf(Media.MediaAritmetica(conjunto1));
					lblNewLabel_6.setText("La media es: "+String.valueOf(Media.MediaAritmetica(conjunto1)));
					break;
				case 2: //Mediana
					OperacionesBasicas Mediana=new OperacionesBasicas();
					//Resultado=String.valueOf(Mediana.Mediana(conjunto1));
					lblNewLabel_6.setText("La mediana es: "+String.valueOf(Mediana.Mediana(conjunto1)));
					break;
				case 3://Moda
					OperacionesBasicas Moda=new OperacionesBasicas();
					//Resultado=String.valueOf(Moda.Moda(conjunto1));
					lblNewLabel_6.setText("La moda es: "+String.valueOf(Moda.Moda(conjunto1)));
					break;
				case 4: //MediaGeometrica
					OperacionesBasicas MediaGeo=new OperacionesBasicas();
					//Resultado=String.valueOf(MediaGeo.MediaGeometrica(conjunto1));
					lblNewLabel_6.setText("La media geometrica es: "+String.valueOf(MediaGeo.MediaGeometrica(conjunto1)));
					break;
				case 5: //Media Armonica
					OperacionesBasicas MediaArmo=new OperacionesBasicas();
					//Resultado=String.valueOf(MediaArmo.MediaArmonica(conjunto1));
					lblNewLabel_6.setText("La media geometrica es: "+String.valueOf(MediaArmo.MediaArmonica(conjunto1)));
					break;
				case 6: //Rango
					double Xk=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de prediccion para el rango"));
					DistribucionT Rango=new DistribucionT(conjunto1,conjunto2,Xk);
					Rango.Correlacion(conjunto1,conjunto2);
					Rango.Correlacion2();
					Rango.RegresionLineal(conjunto1, conjunto2);
					Rango.PrediccionY(Rango.Beta0,Rango.Beta1,Xk);
					Rango.Rango();
					lblNewLabel_6.setText("El rango es:"+String.valueOf(Rango.Rango));
					break;
				case 7: //Varianza
					OperacionesBasicas Varianza=new OperacionesBasicas();
					//Resultado=String.valueOf(Mediana.Mediana(conjunto1));
					double varianza=Varianza.DesviacionEstandar(conjunto1);
					varianza=Math.pow(varianza, 2);
					lblNewLabel_6.setText("La Varianza es: "+String.valueOf(varianza));
					break;
				case 8: //DesvEstandar
					OperacionesBasicas DesvEstandar=new OperacionesBasicas();
					//Resultado=String.valueOf(Mediana.Mediana(conjunto1));

					lblNewLabel_6.setText("La Desviacion Estandar es: "+String.valueOf(DesvEstandar.DesviacionEstandar(conjunto1)));
					break;
				case 9: //Correlacion
					DistribucionT Correlacion=new DistribucionT(conjunto1,conjunto2,0);
					Correlacion.Correlacion(conjunto1,conjunto2);
					lblNewLabel_6.setText("La Correlacion es: "+String.valueOf(Correlacion.Cor));
					break;
				case 10: //Regresion Multifactorial
					double Wk=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de prediccion Wk "));
					double Xk1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de prediccion Xk "));
					double Yk=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de prediccion Yk "));
					RegresionMultiple RegresionMultiple= new RegresionMultiple(conjunto1,conjunto2,conjunto3,conjunto4, Wk,  Xk1, Yk);
					RegresionMultiple.MatrizGauss();
					RegresionMultiple.Gauss();
					RegresionMultiple.Rango();
					RegresionMultiple.PrediccionY();
					RegresionMultiple.LUPI();
					lblNewLabel_6.setText(RegresionMultiple.toString());
					break;
				case 11://Integral simpson  //No necesita ingresar datos
					int dof=Integer.parseInt(JOptionPane.showInputDialog("Ingresa los grados de libertad a considerar"));
					double x1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor inicial del rango de la distribucion normal"));
					double x2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor final del rango de la distribucion normal"));
					IntegralSimpson IntSimpson=new IntegralSimpson(dof,x1,x2);
					lblNewLabel_6.setText("<html>El resultado de la integral <br> es:"+String.valueOf(IntSimpson.IntegralSimpson2())+"<html>");
					break;
				case 12: //Distribucion Normal
					double x1N=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de X1 (Inicio de la distribucion)"));
					double x2N=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de X2 (Fin de la distribucion)"));
					int Nseg=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de segmentos a considerar"));
					DistribucionT DistribucionN=new DistribucionT(x1N,x2N,Nseg);
					DistribucionN.DistribucionNormal();
					//Investigar que se desea calcular????
					break;
				case 13: // Integral de: Distribucion T student  
					double dofT=Double.parseDouble(JOptionPane.showInputDialog("Ingresa los grados de libertad a considerar"));
					double xkDisT =Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor Xk a calcular"));
					DistribucionT DistribucionT=new DistribucionT(dofT);
					lblNewLabel_6.setText("<html>El resultado de la integral <br> de Distribucion T student <br> es:"+String.valueOf(DistribucionT.Fx(xkDisT))+"<html>");
					break;
				case 14: //Distribucion Chi cuadrada
					break;
				default:
					lblNewLabel_6.setText("Usted introdujo una opcion no valida");
					break;					
				}
			}
		});
	}
}
