import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
 
public class ListExample {
 
    public static void main(String[] args) {
        List listA = new ArrayList();
     
        listA.add("���");
        listA.add("ȫ�Ƹ�");
        listA.add(new String("ȫ�浿"));
         
        listA.add(1, "1��° ��Ұ�");
         
         
        // �ε����� ���� ��ȸ
        String element0 = listA.get(0).toString();
        String element1 = listA.get(1).toString();
        String element3 = listA.get(2).toString();
 
        //Iterator ���� ��ü ��ȸ
        Iterator iterator = listA.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
             
        }
 
        //for-loop ���� ��ü ��ȸ
        for(Object object : listA) {
            String element = (String) object;
        }
         
// ȫ�浿 �տ� �� �߰�
        int index = listA.indexOf("ȫ�浿");
        listA.add(index, "ȫ�浿 �տ� �� �߰�");
 
        // ���� ���� Ȯ��
        System.out.println(listA.contains("ȫ�浿"));
         
        // �� �����ϴ� ���
        System.out.println(listA.remove(0));
        System.out.println(listA.remove("ȫ�浿"));
    }
}


