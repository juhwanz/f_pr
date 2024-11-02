package 자료구조;

import java.util.LinkedList;

public class 단순연결리스트 {
    /*public static void main(String[] args) {
        LinkedList L = new LinkedList();
        System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");

        L.insertLastNode("월");
        L.insertLastNode("수");
        L.insertLastNode("일");
       // L.printList();



    }
}

class LinkedList{
    private ListNode head;
    public LinkedList(){
        head = null;
    }

    public void insertMiddleNode(ListNode pre, String data){
        ListNode newNode = new ListNode(data);
        newNode.link = pre.link;
        pre.link = newNode;
    }

    public void insertLastNode(String data){
        ListNode  newNode = new ListNode(data);
        if(head == null){
            this.head = newNode;

        }
        else{
            ListNode temp = head;
            while(temp.link != null) temp = temp.link;
            temp.link = newNode;
        }
    }

}

class ListNode{
    private String data;    // 데이터 필드
    public ListNode link;   //링크 필드
    public ListNode(){      //초기 생성
        this.data = null;
        this.link = null;
    }

    public ListNode(String data){       //마지막 리스트 노드
        this.data = data;
        this.link = null;
    }

    public ListNode(String data, ListNode link){    //데이터랑 링크 입력
        this.data = data;
        this.link = link;
    }

    public String getData(){    // 데이터 가져오기
        return this.data;
    }*/
}
