package panel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import interfaces.Movimientos;

public class Panel extends JPanel implements KeyListener,Movimientos{
 
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private int i=2;
	private JLabel label;
	private boolean enMovimiento;
	
	public Panel(){
		
		setLayout(null);
		setSize(400,400);
		label = new JLabel(new ImageIcon("src/imagen/derecha1.png"));
		add(label).setBounds(0,0,32,32); 
	}
	
	@Override
	public void keyPressed(KeyEvent e) { 
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
				enMovimiento=true;
				moverDerecha(); 
				System.out.println("derecha");
				break;
		 
		case KeyEvent.VK_DOWN:
				enMovimiento=true;
				moverAbajo(); 
				break;
	 
		case KeyEvent.VK_UP:
				enMovimiento=true;
				moverArriba(); 
				break;
			
		case KeyEvent.VK_LEFT:
				enMovimiento=true;
				moverIzquierda(); 
				break;
		} 
	}
	
	@Override
	public void keyReleased(KeyEvent e) { 
		
		enMovimiento=false;
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			detenerDerecha();
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
			detenerIzquierda();
		if(e.getKeyCode()==KeyEvent.VK_UP)
			detenerArriba();
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
			detenerAbajo();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void moverArriba() { 
		
		ImageIcon img;
		y = label.getY();
		if(i<=4){
			img = new ImageIcon("src/imagen/arriba"+i+".png");
			label.setIcon(img);
			y = y-10;
			this.add(label).setBounds(x,y,32,32);
			i++;
			
		}else{
			i=1;
			img = new ImageIcon("src/imagen/arriba"+i+".png");
			label.setIcon(img);
			y = y-10;
			this.add(label).setBounds(x,y,32,32);
			i++;
		}
	}
	
	@Override
	public void moverAbajo() { 
		
		ImageIcon img;
		y = label.getY();
		 
		if(i<=4){
			img = new ImageIcon("src/imagen/abajo"+i+".png");
			label.setIcon(img);
			y = y+10;
			this.add(label).setBounds(x,y,32,32);
			i++;
			
		}else{
			i=1;
			img = new ImageIcon("src/imagen/abajo"+i+".png");
			label.setIcon(img);
			y = y+10;
			this.add(label).setBounds(x,y,32,32);
			i++;
		} 
	}
	
	@Override
	public void moverIzquierda() { 
		
		ImageIcon img;
		x = label.getX();
		if(i<=4){
			img = new ImageIcon("src/imagen/izquierda"+i+".png");
			label.setIcon(img);
			x = x-10;
			this.add(label).setBounds(x,y,32,32);
			i++;
			
		}else{
			i=1;
			img = new ImageIcon("src/imagen/izquierda"+i+".png");
			label.setIcon(img);
			x = x-10;
			this.add(label).setBounds(x,y,32,32);
			i++;
		}
	}
	
	@Override
	public void moverDerecha() { 
		
		ImageIcon img;
		x = label.getX();
		if(enMovimiento==true){
		if(i<=4){
			img = new ImageIcon("src/imagen/derecha"+i+".png");
			label.setIcon(img);
			x = x+10;
			this.add(label).setBounds(x,y,32,32);
			i++; 
			
		}else{
			i=1;
			img = new ImageIcon("src/imagen/derecha"+i+".png");
			label.setIcon(img);
			x = x+10;
			this.add(label).setBounds(x,y,32,32);
			i++; 
		}}
	}
	
	@Override
	public void detenerArriba() { 
		
		ImageIcon img; 
		if(enMovimiento==false){
			img = new ImageIcon("src/imagen/arriba1.png");
			label.setIcon(img);
			this.add(label).setBounds(x,y,32,32);
		}
	}
	
	@Override
	public void detenerAbajo() { 
		
		ImageIcon img; 
		if(enMovimiento==false){
			img = new ImageIcon("src/imagen/abajo1.png");
			label.setIcon(img);
			this.add(label).setBounds(x,y,32,32);
		}
	}
	
	@Override
	public void detenerIzquierda() { 
		
		ImageIcon img; 
		if(enMovimiento==false){
			img = new ImageIcon("src/imagen/izquierda1.png");
			label.setIcon(img);
			this.add(label).setBounds(x,y,32,32);
		}
	}
	
	@Override
	public void detenerDerecha() { 
		ImageIcon img; 
		if(enMovimiento==false){
			img = new ImageIcon("src/imagen/derecha1.png");
			label.setIcon(img);
			this.add(label).setBounds(x,y,32,32);
		}
	}
}
