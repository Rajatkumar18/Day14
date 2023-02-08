package com.DS;
//class Node{
//	int data;
//	Node next;
//	
//	Node(int data){
//		this.data=data;
//		this.next=null;
//	}
//}
public class QueueDemo {
	
	static Node headNode;
	public  void enqueue(int data){
		Node newNode=new Node(data);
		if(headNode==null) {
			headNode=newNode;
			}
		else {
			Node temp=headNode;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	public int dequeue() {
		Node temp=headNode;
		if(temp!=null) {
			headNode =temp.next;
			return temp.data;
		}
		return 0;
		
	}
	public void printData() {
		Node temp=headNode;
		while(temp!=null) {
			System.out.print(temp.data+"->");
				temp=temp.next;
			
		}
	}
	public static void main(String[] args) {
		QueueDemo demo=new QueueDemo();
		demo.enqueue(56);
		demo.enqueue(30);
		demo.enqueue(70);
		
		
		System.out.println("Queue data..");
		demo.printData();
		
	}

}
