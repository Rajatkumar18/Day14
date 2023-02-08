package com.DS;
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class StackDemo {
	static Node headNode;
	
	public void push(int data) {
		Node newNode= new Node(data);
		if(headNode==null) {
			headNode=newNode;
		}else {
			newNode.next=headNode;
			headNode=newNode;
		}
		
	}
	
	public int pop() {
		Node temp=headNode;
		if(temp !=null) {
			headNode=temp.next;
			return temp.data;
		}
		return 0;
		
	}
	public int peak() {
		if(headNode!=null) {
			return headNode.data;
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
		StackDemo demo=new StackDemo();
		demo.push(70);
		demo.push(30);
		demo.push(56);
		
		
		System.out.println("satck data..");
		demo.printData();
		System.out.println("pop data..");
		System.out.println(demo.pop());
		System.out.println("peak data..");
		System.out.println(demo.peak());
		
		
	}
}
