import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class button
{
	JFrame jFrame = new JFrame("�̹��� GridLayout�̴�!!");
	JButton [] btn = new JButton [9]; //6�� ����
	
	public button()
    {
		//GridLayout ����
		jFrame.setLayout(new GridLayout(3,2));
		
		//�����̳� ��������
		Container container = jFrame.getContentPane();
		
		//������Ʈ ���� �� �߰��ϱ�
		for(int i=0; i < btn.length; i++)
		{
			if(i%2==0){
			btn[i] = new JButton(i+"o");
			}else{
			
			}
			container.add(btn[i]);
		}
		
		//������ ũ�� �����ϱ�
		jFrame.setSize(300,300);
		
		//������ ���̱�
		jFrame.setVisible(true);
		
		//�����ư�� ���� ����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
    }

	public static void main(String[] args)
	{
		new button();
	}

}